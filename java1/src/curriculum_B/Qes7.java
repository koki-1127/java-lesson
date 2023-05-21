package curriculum_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// メッセージ表示
		System.out.print("生徒の人数を入力してください（2以上）: ");
		// n人の入力宣言
		Scanner scan = new Scanner(System.in);
		// n人の入力受け取り
		double n= scan.nextInt();
		
		// マップの生成
		Map<Integer, Map<String,Integer>> score_map = new HashMap<>();
		/* ----------------------------------------------
		 [概要] マップの中身を入力と紐づける処理
		 [詳細] 入力の数値分for文を回す、数値と入力をマップに組み込む処理
		 ---------------------------------------------- */
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "人目の『英語』の点数を入力してください :");
			Integer english = scan.nextInt();
			System.out.print(i + "人目の『数学』の点数を入力してください :");
			Integer math = scan.nextInt();
			System.out.print(i + "人目の『理科』の点数を入力してください :");
			Integer science = scan.nextInt();
			System.out.print(i + "人目の『社会』の点数を入力してください :");
			Integer social = scan.nextInt();
			System.out.println(); // 改行
			
			// マップの中身をそれぞれの入力と紐づける処理
			score_map.put(i, new HashMap<String,Integer>());
			score_map.get(i).put("english",english);
			score_map.get(i).put("math", math);
			score_map.get(i).put("science", science);
			score_map.get(i).put("social", social);
		}
		// 教科それぞれの初期値の設定
		double english_avg = 0;
		double math_avg = 0;
		double science_avg = 0;
		double social_avg = 0;
		
		/* ----------------------------------------------
		 [概要] n人目の平均点の出力処理と平均の計算式
		 [詳細] 入力回数分for文を回して、getでn人目の成績を取得して合計値を出す
		 ---------------------------------------------- */
		for (Integer Subject : score_map.keySet()) {
			double sum = (score_map.get(Subject).get("english") 
						+ score_map.get(Subject).get("math") 
						+ score_map.get(Subject).get("science") 
						+ score_map.get(Subject).get("social"));
			// n人目すべての教科の合計から平均を出す処理
			double avgs = sum / 4;
			// メッセージ表示
			System.out.println(Subject + "人目の平均点は" + String.format("%.2f", avgs) + "点です。");
			
			// それぞれの教科の平均点を出す処理
			english_avg += score_map.get(Subject).get("english") / n;
			math_avg += score_map.get(Subject).get("math") / n;
			science_avg += score_map.get(Subject).get("science") / n;
			social_avg += score_map.get(Subject).get("social") / n;
		}
		// それぞれの平均点の出力処理
		System.out.println("\n英語の平均点は" + String.format("%.2f", english_avg) + "点です。");
		System.out.println("数学の平均点は" + String.format("%.2f", math_avg) + "点です。");
		System.out.println("理科の平均点は" + String.format("%.2f", science_avg) + "点です。");
		System.out.println("社会の平均点は" + String.format("%.2f", social_avg) + "点です。");
		System.out.println("全体の平均点は" + String.format("%.2f", (english_avg + math_avg + science_avg + social_avg) / 4) + "点です。");
	}
}