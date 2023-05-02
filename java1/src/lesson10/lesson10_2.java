package lesson10;

public class lesson10_2 {

	public static void main(String[] args) {
		/*	
		問題.for文を使用して九九の計算を出力してください。
			※出力例 	1×1=1 1×2=2…1×9=9
						2×1=2 2×2=4…2×9=18
								・
								・
								・
						9×1=9 9×2=18…9×9=81
		 */
		//１～９の入った変数の定義
		int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//変数０の定義、一ずつ足していく処理
		for (int i =0; i < number.length; i++) {
			//変数０の定義、一ずつ足していく処理
			for (int j = 0; j < number.length; j++) {
				//掛け算の式
				int kuku_inner = number[i] * number[j];
				//掛け算の結果出力
				System.out.print(number[i] + "×" + number[j] + "=" + kuku_inner + " ");
			}
			//改行の処理
			for (int x = 0; x < 1; x++) {
				for (int y = 1; y > x; y--) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
