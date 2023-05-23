package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// 文言の入力宣言
		Scanner scan = new Scanner(System.in);
		// "、"を含めた入力を受け取る処理
		String[] line = scan.nextLine().split("、");
		/* ----------------------------------------------
		 [概要] 入力文言の回数分、処理を行う
		 [詳細] 入力のsplitで区切った回数分for分を回して文言に合った出力方法を指定する処理
		 ---------------------------------------------- */
		for(String ones : line) {
			// ランダムの宣言
			Random random = new Random();
			// 数字は0～11をランダムに表示
			int random_num = random.nextInt(12);
			/* ----------------------------------------------
			 [概要] 入力内容で出力を変化
			 [詳細] 台数はランダムに表示、入力内容に合う文言をみつけて出力する処理
			 ---------------------------------------------- */
			switch(ones) {
			case "パソコン","冷蔵庫","扇風機","洗濯機","加湿器":
				String str;
				str = ones.matches("パソコン") ? "\nパソコンの残り台数は" + random_num + "台です\n"
					: ones.matches("冷蔵庫") ? "冷蔵庫の残り台数は" + random_num + "台です\n"
					: ones.matches("扇風機") ? "扇風機の残り台数は" + random_num + "台です\n"
					: ones.matches("洗濯機") ? "洗濯機の残り台数は" + random_num + "台です\n"
					: ones.matches("加湿器") ? "加湿器の残り台数は" + random_num + "台です\n"
					: "";
				// メッセージ表示
				System.out.println(str);
				break;
				
			case "テレビ","ディスプレイ":
				str = ones.matches("テレビ") ? "テレビの残り台数は" + random_num + "台です\n"
					: "ディスプレイの残り台数は" + random_num + "台です\n";
				// メッセージ表示
				System.out.println(str);
				break;
				
			default:
				// 上記のcaseに当てはまらない場合のメッセージ表示
				System.out.println("『" + ones +  "』は指定の商品ではありません");
			}
		}
	}
}