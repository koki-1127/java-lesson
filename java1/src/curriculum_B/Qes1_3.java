package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// [概要]名前入力の判別
		// 【詳細】入力が１～１０文字以内の半角英数字になるまでループする処理
		while(true) {
			
			// 標準入力
			Scanner scaner = new Scanner(System.in);
			String line = scaner.nextLine();

			// 入力が１０文字以上の半角英数字の場合の出力
			if (line.matches("^[A-Za-z0-9]{10,}+$")) {
				System.out.println("名前を10文字以内にしてください"); 
			}
			// 何も入力されていない、nullの場合の出力
			else if (line.matches("^$") || line.equals(null)) {
				System.out.println("名前を入力してください");
			}
			// 入力が半角英数字以外の場合の出力
			else if (!line.matches("^[-@+*;:#$%&\\w]+$")) {
				System.out.println("半角英数字のみで名前を入力してください"); 
			}
			// 半角英数字で１～１０文字以内の場合の出力
			else if (line.matches("^[A-Za-z0-9]{1,10}+$")) {
				
				System.out.println("ユーザー名「" + line + "」を登録しました");
				Random rand2 = new Random();
				String judge = "draw";
				int matchCount = 0;
				
				// [概要]勝つまでループする処理
				// 【詳細】do while文でじゃんけんをループさせて毎回、結果を出力
				do {
					System.out.println("じゃんけんゲーム　(グー：0　チョキ：1　パー：2　どれかの数字をいれてください。)");
					System.out.println(); // 改行
					
					
					// プレイヤーの手を入力する処理
					System.out.print("じゃんけん：");
					Scanner sca = new Scanner(System.in);
					int playerhand = sca.nextInt();
					System.out.println(); // 改行
					
					// pcの手をランダムに出力、じゃんけんの処理
					int computerhand = rand2.nextInt(3);
					judge=JankenJudge1(playerhand,computerhand);
					
					// じゃんけんの回数をカウント
					matchCount += 1;
					
					// [概要]手の出力
					// 【詳細】プレイヤーそれぞれの手を出力する処理
					if(playerhand==0) {
						System.out.println( line + "の手はグー"); 
					}
					else if(playerhand==1) {
						System.out.println( line + "の手はチョキ"); 
					}
					else {
						System.out.println( line + "の手はパー"); 
					} 
					
					
					// 【詳細】pcそれぞれの手を出力する処理
					if(computerhand==0) {
						System.out.println( "相手の手はグー");
					}
					else if(computerhand==1) {
						System.out.println( "相手の手はチョキ");
					}
					else {
						System.out.println( "相手の手はパー");
					} 
					
					
					// [概要]勝敗によるループ
					// 【詳細】勝った場合の出力、breakでループから抜ける
					if (judge.equals("win")) {
						System.out.println("やるやん。"+ "\n" +"次は俺にリベンジさせて");
						System.out.println(); // 改行
						System.out.println("勝つまでにかかった合計回数は"+matchCount+"です。");
						break;
					}
					
					
					// 【詳細】負けの場合の手に合わせてそれぞれ出力
					else if(judge.equals("lose")){
						if(computerhand==0) {
							System.out.println("俺の勝ち！"+ "\n" +"負けは次に繋がるチャンスです"+
											   "\n" +"ネバーギブアップ！");
							System.out.println(); // 改行
						}
						if(computerhand==1) {
							System.out.println("俺の勝ち！"+ "\n" +"たかがじゃんけん、そう思ってないですか？"+
											   "\n" +"それやったら次も、俺が勝ちますよ");
							System.out.println(); // 改行
						}
						if(computerhand==2) {
							System.out.println("俺の勝ち！"+ "\n" +"なんで負けたか、明日まで考えといてください。"+
											   "\n" +"そしたら何かが見えてくるはずです");
							System.out.println(); // 改行
						}
					}
					
					// 【詳細】あいこの出力
					else if(judge.equals("draw")){
						System.out.println("DRAW あいこ もう一回しましょう！");
						System.out.println(); // 改行
					}
				}
				// do while文の条件式
				while(true);
			}
			// 名前入力が１～１０文字以内の半角英数字の場合ループから抜けるbreak
			break;
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