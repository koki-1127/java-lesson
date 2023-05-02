package lesson10;

public class lesson10_1 {

	public static void main(String[] args) {

		/*
		問題.for文を使用し、以下のプログラムを作成してください。
		①変数iに1を代入
		②変数iに2ずつ足す処理を10回繰り返す。
			出力結果：  3
						5
						7
						9
						・
						・
						・
						21
		 */
		
		//初期値を１、21以上を出力しない、２ずつ足す、の記述
		for (int i=1; i < 22; i=i+2) {
			//反復処理の制御で１の出力をしないようにする
			if (i == 1) {
				continue;
			}
			//計算結果を出力
			System.out.println(i);
		}
	}
}
