package curriculum_B;

import java.util.StringJoiner;

public class Qes5 {

	public static void main(String[] args) {
		// 配列の生成
		int number[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int number2[] = {1,2,3,4,5,6,7,8,9};
		// [概要]表の制作
		// 【詳細】9回for文を回して縦9列の表を生成する処理
		for (int i =0; i < number2.length; i++) {
			// 20回for文を回して横20列の表を作る処理
			for (int j = 0; j < number.length; j++) {
				// 掛け算の式
				int answer = number2[i] * number[j];
				// [概要]処理の合間に||を入れる処理
				// 【詳細】19まではjoinerで||を間に出力、それぞれ表示桁数を指定して出力
				if (number[j] < 10 ) {
					StringJoiner sj= new StringJoiner("", "", "||");
					sj.add(String.format("%02d", number[j])).add("*").add(String.format("%02d", number[i]))
					.add("=").add(String.format("%03d",answer));
					System.out.print(sj);
				} else if(number[j] < 20) {
					StringJoiner sj= new StringJoiner("", "", "||");
					sj.add(String.format("%03d", number[j])).add("*").add(String.format("%02d", number[i]))
					.add("=").add(String.format("%03d",answer));
					System.out.print(sj);
				} else {
					System.out.print(String.format("%03d", number[j]) + "*" +
							String.format("%02d", number[i]) + "=" + String.format("%03d", answer));
				}
			}
			// 20まで回したら改行
			System.out.println();
		}
	}
}
