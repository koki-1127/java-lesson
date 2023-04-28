package lesson11;

public class lesson11 {

	public static void main(String[] args) {
		/*
		問題．switch文を使用し、以下のプログラムを作成してください。
		変数に数値を代入

		①2の場合は、「（変数）月は28日です。」
		出力結果：2月は28日です。

		②4，6，9，11の場合は、「（変数）月は30日です。」
		出力例：4月は30日です。

		③その他の場合は、「（変数）月は31日です。」
		出力例：1月は31日です。
		 */
		
		//変数に１を代入
		int num =1;
		//switch文で条件分岐
		switch(num) {
		//numの値が２の際の分岐
		case 2:
			//２の際の出力
			System.out.println(num + "月は28日です。");
			//処理を中断してswitch文から抜けだす。
			break;
		//numの値が4.6.9.11の際の分岐
		case 4:
		case 6:
		case 9:
		case 11:
			//4.6.9.11の際の出力
			System.out.println(num + "月は30日です。");
			//処理を中断してswitch文から抜けだす。
			break;
		//その他の場合の出力
		default:
			System.out.println(num + "月は31日です。");
		}
	}
}
