package curriculum_B;

import java.util.StringJoiner;

public class Qes4 {

	public static void main(String[] args) {
		// [概要]表の制作
		// 【詳細】9回for文を回して縦9列の表を生成する処理
		for (int i =1; i <= 9; i++) {
			
			// 9回for文を回して横9列の表を生成する処理
			for (int j = 1; j <= 9; j++) {
				
				// 掛け算の式
				int answer = i * j;
				
				// [概要]処理の合間に||を入れる処理
				// 【詳細】8まではjoinerで||を間に出力
				if (j < 9 ) {
					StringJoiner sj= new StringJoiner("", "", "||");
					
					// 01*01=01 の表示で出力
					sj.add(String.format("%02d", i)).add("*").add(String.format("%02d", j))
					.add("=").add(String.format("%02d",answer));
					System.out.print(sj);
				} 
				// 9の計算式のみjoinerを使わず出力
				else {
					System.out.print(String.format("%02d", i) + "*" +
									  String.format("%02d",j) + "=" + String.format("%02d", answer));
				}
			}
			// 9まで回したら改行
			System.out.println();
		}
	}
}