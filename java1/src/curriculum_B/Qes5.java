package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		/* ----------------------------------------------
		// [概要]表の制作
		// [詳細]9回for文を回して縦9列の表を生成する処理
		 ---------------------------------------------- */
		for (int i =1; i <= 9; i++) {
			
			// 20回for文を回して横20列の表を作る処理
			for (int j = 1; j <= 20; j++) {
				
				// 掛け算の式
				int answer = i * j;
				/* ----------------------------------------------
				 [概要] 処理の合間に || を入れる処理
				 [詳細] 19までは || を間に入れて[ 001 * 001 = 001 ]の表示で出力
				 ---------------------------------------------- */
				if (j < 20 ) {
					System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i)
									+ " = " + String.format("%03d", answer) + " || ");
				} 
				
				// 20の計算式のみ || を入れず出力
				else {
					System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i)
									+ " = " + String.format("%03d", answer));
				}
			}
			// 20まで回したら改行
			System.out.println();
		}
	}
}
