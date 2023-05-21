package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// 名前入力のscanner宣言
		Scanner scaner = new Scanner(System.in);
		// 入力が正しい場合ループから出るflagの宣言、初期値の設定
		boolean flag = true;
		/* ----------------------------------------------
		 [概要] 名前入力の判別
		 [詳細] 入力が１～１０文字以内の半角英数字になるまでループする処理
		 ---------------------------------------------- */
		do {
			// 名前入力の受け取り
			String line = scaner.nextLine();
			
			// 何も入力されていない、nullの場合の出力
			if (Objects.isNull(line) || line.matches("^$")) {
				System.out.println("名前を入力してください"); 
			}
			// 入力が１０文字以上の半角英数字の場合の出力 
			else if (line.matches("^[A-Za-z0-9]{10,}+$")) {
				System.out.println("名前を10文字以内にしてください");
			}
			// 入力が半角英数字以外の場合の出力
			else if (!line.matches("^[-@+*;:#$%&\\w]+$")) {
				System.out.println("半角英数字のみで名前を入力してください");
			}
			// 入力が半角英数字で１～１０文字以内の場合の出力
			else if (line.matches("^[A-Za-z0-9]{1,10}+$")) {

				// 半角英数字で１～１０文字以内の場合、falseに変更してループから抜ける
				flag = false;
				// メッセージ表示
				System.out.println("ユーザー名「" + line + "」を登録しました");
				// computerhandのランダム生成
				Random rand = new Random();
				// 勝敗の値を受け取る宣言
				String judge;
				// じゃんけん回数のカウント初期値
				int matchCount = 0;
				// メッセージ表示
				System.out.println("じゃんけんゲーム(数字で入力してください「0:グー、1:チョキ、2:パー」)"+ "\n");
				

				/* ----------------------------------------------
				 [概要] 勝つまでループする処理
				 [詳細] do while文でじゃんけんをループさせて毎回、結果を出力
				 ---------------------------------------------- */
				do {
					// メッセージ表示
					System.out.print("じゃんけん：");
					// プレイヤーの手の入力宣言
					Scanner sca = new Scanner(System.in);
					// プレイヤーの手を入力を受け取る
					int playerhand = sca.nextInt();
					// pcの手を０～２でランダムに出力
					int computerhand = rand.nextInt(3);
					// じゃんけんの処理
					judge = JankenJudge(playerhand,computerhand);
					// じゃんけんの回数を+1でカウントしていく処理
					matchCount += 1;
					
					/* ----------------------------------------------
					 [概要] 手の出力
					 [詳細] pc、プレイヤーそれぞれの手を出力する処理
					 ---------------------------------------------- */
					String[] janken = {"グー","チョキ","パー"};
					System.out.println(line + "の手は「" + janken[playerhand] + "」\n"
										+ "相手の手は「" + janken[computerhand] + "」\n");
					
					/* ----------------------------------------------
					 [概要] 勝敗によるループ
					 [詳細] 勝った場合の出力、ループから抜ける
					 ---------------------------------------------- */
					if (judge.equals("win")) {
						System.out.println("やるやん。\n次は俺にリベンジさせて\n" 
											+ "\n勝つまでにかかった合計回数は" + matchCount + "回です。");
					}
					
					/* ----------------------------------------------
					 [概要] 負けの場合のループ
					 [詳細] 負けの場合の手に合わせてメッセージ表示
					 ---------------------------------------------- */
					else if(judge.equals("lose")){
						if(computerhand == 0) {
							System.out.println("俺の勝ち！\n負けは次に繋がるチャンスです\n"
												+ "ネバーギブアップ！\n");
						}
						if(computerhand == 1) {
							System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\n"
												+ "\nそれやったら次も、俺が勝ちますよ\n");
						}
						if(computerhand == 2) {
							System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\n"
												+ "\nそしたら何かが見えてくるはずです\n");
						}
					}
					
					// あいこの場合のメッセージ表示
					else if(judge.equals("draw")){
						System.out.println("DRAW あいこ もう一回しましょう！\n");
					}
				}
				// じゃんけんのループの条件式、勝ち以外の場合は処理が続く
				while(!judge.equals("win"));
				}
			// 名前入力の条件式、flagがfalseに変更されるまで処理が続く
			}while(flag);
		}


	/* ----------------------------------------------
	 [概要] じゃんけんの結果を返すメソッド
	 [詳細] judgeの値を勝敗毎に変動させる処理
	 ---------------------------------------------- */
	public static String JankenJudge(int playerhand,int computerhand) {
		String judge;
		if((playerhand == 0 && computerhand == 1) 
			|| (playerhand == 1 && computerhand == 2) 
			|| (playerhand == 2 && computerhand == 0)) {
			judge = "win";
		}
		else if(playerhand == computerhand) {
			judge = "draw";
		}
		else {
			judge = "lose";
		}
		return judge;
	}
}
