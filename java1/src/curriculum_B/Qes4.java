package curriculum_B;

import java.util.StringJoiner;

public class Qes4 {

	public static void main(String[] args) {
		// １～９の入った配列の定義
		int number[] = {1,2,3,4,5,6,7,8,9};
		// [概要]表の制作
		// 【詳細】9回for文を回して縦9列の表を生成する処理
		for (int i =0; i < number.length; i++) {
			// 9回for文を回して横9列の表を生成する処理
			for (int j = 0; j < number.length; j++) {
				// 掛け算の式
				int answer = number[i] * number[j];
				// [概要]処理の合間に||を入れる処理
				// 【詳細】8まではjoinerで||を間に出力、表示桁数を指定して出力
				if (number[j] < 9 ) {
					StringJoiner sj= new StringJoiner("", "", "||");
					sj.add(String.format("%02d", number[i])).add("*").add(String.format("%02d", number[j]))
					.add("=").add(String.format("%02d",answer));
					System.out.print(sj);
				} else {
					System.out.print(String.format("%02d", number[i]) + "*" +
							String.format("%02d", number[j]) + "=" + String.format("%02d", answer));
				}
			}
			// 9まで回したら改行
			System.out.println();
		}
	}
}