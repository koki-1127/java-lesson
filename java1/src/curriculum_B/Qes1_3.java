package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// [概要]正規表現の指定
		// 【詳細】１～１０文字以内の半角英数字、１０文字以上の半角英数字、何も入力されていないの３パターン
		Pattern pattern1 = Pattern.compile("^[A-Za-z0-9]{1,10}+$");
		Pattern pattern2 = Pattern.compile("^[A-Za-z0-9]{10,}+$");
		Pattern pattern3 = Pattern.compile("^$");
		// 標準入力
		Scanner scaner = new Scanner(System.in);
		String line = scaner.nextLine();
		// 【詳細】それぞれの正規表現に該当するか入力を判別する
		Matcher matcher1 = pattern1.matcher(line);
		Matcher matcher2 = pattern2.matcher(line);
		Matcher matcher3 = pattern3.matcher(line);
		// 【詳細】入力が１～１０文字以内の半角英数字の場合の処理
		if (matcher1.find()) {
			Random rand1 = new Random();
			Random rand2 = new Random();
			String judge = "draw";
			int matchCount = 0;
			// [概要]勝つまでループする処理
			// 【詳細】do while文でじゃんけんをループさせて毎回、結果を出力
			do {
				// プレイヤーとpcの手を０～２の中でランダム
				int playerhand = rand1.nextInt(2);
				int computerhand = rand2.nextInt(2);
				// じゃんけんの処理
				judge=JankenJudge1(playerhand,computerhand);
				// じゃんけんの回数をカウント
				matchCount += 1;
				System.out.println("ユーザー名「" + line + "」を登録しました");
				// [概要]手の出力
				// 【詳細】プレイヤーそれぞれの手を出力する処理
				if(playerhand==0) {
					System.out.println( line + "の手はグー"); 
				}else if(playerhand==1) {
					System.out.println( line + "の手はチョキ"); 
				}else {
					System.out.println( line + "の手はパー"); 
				} 
				// 【詳細】pcそれぞれの手を出力する処理
				if(computerhand==0) {
					System.out.println( "相手の手はグー");
				}else if(computerhand==1) {
					System.out.println( "相手の手はチョキ");
				}else {
					System.out.println( "相手の手はパー");
				} 
				// [概要]勝敗によるループ
				// 【詳細】勝った場合の出力、breakでループから抜ける
				if (judge.equals("win")) {
					System.out.println("やるやん。"+ "\n" +"次は俺にリベンジさせて");
					System.out.println();
					System.out.println("勝つまでにかかった合計回数は"+matchCount+"です。");
					break;
					// 【詳細】負けの場合の手に合わせてそれぞれ出力
					}else if(judge.equals("lose")){
					if(computerhand==0) {
						System.out.println("俺の勝ち！"+ "\n" +"負けは次に繋がるチャンスです"+ "\n" +"ネバーギブアップ！");
						System.out.println();
					}if(computerhand==1) {
						System.out.println("俺の勝ち！"+ "\n" +"たかがじゃんけん、そう思ってないですか？"+ "\n" +"それやったら次も、俺が勝ちますよ");
						System.out.println();
					}if(computerhand==2) {
						System.out.println("俺の勝ち！"+ "\n" +"なんで負けたか、明日まで考えといてください。"+ "\n" +"そしたら何かが見えてくるはずです");
						System.out.println();
					}
					// 【詳細】あいこの出力
					}else if(judge.equals("draw")){
					System.out.println("DRAW あいこ もう一回しましょう！");
					System.out.println();
					}
				}
			while(judge.equals("lose")||judge.equals("win")||judge.equals("draw"));
		// 入力が１０文字以上の半角英数字の場合の処理
		}else if (matcher2.find()) {
		System.out.println("名前を10文字以内にしてください"); 
		// 何も入力されていない、nullの場合の処理
		}else if (matcher3.find() || line.equals(null)) {
		System.out.println("名前を入力してください"); 
		// 入力が半角英数字以外の場合の出力
		}else if (!line.matches("^[-@+*;:#$%&\\w]$")) {
		System.out.println("半角英数字のみで名前を入力してください"); 
		}
	}

	// [概要]じゃんけんの結果を返すメソッド
	// 【詳細】judgeの値を勝敗毎に変動させる処理
	public static String JankenJudge1(int playerhand,int computerhand) {
		String judge = "draw";
		if((playerhand==0 && computerhand==1)||(playerhand==1 && computerhand==2)||
				(playerhand==2 && computerhand==0)) {
			judge="win";
		}else if(playerhand==computerhand) {
			judge="draw";
		}else {
			judge="lose";
		}
		return judge;
	}
}