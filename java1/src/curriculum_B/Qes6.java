package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// "、"を含めた入力を受け取る処理
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] fruits = line.split("、");
		// [概要]入力文言の回数分、処理を行う
		// 【詳細】入力のsplitで区切った回数分for分を回して文言に合った出力方法を指定する処理
		for(String ones : fruits) {
			// 数字は0～11をランダムに表示
			Random random = new Random();
			int random_num = random.nextInt(11);
			// [概要]入力内容で出力を変化
			// 【詳細】台数はランダムに表示、入力内容に合う文言をみつけて出力する処理
			switch(ones) {
			case "パソコン":
				System.out.println( ones.matches("パソコン") ? "パソコン残り台数は" + random_num + "台です" : "");
				break;
			case "冷蔵庫":
				System.out.println( ones.matches("冷蔵庫") ? "冷蔵庫残り台数は" + random_num + "台です" : "");
				break;
			case "扇風機":
				System.out.println( ones.matches("扇風機") ? "扇風機残り台数は" + random_num + "台です" : "");
				break;
			case "洗濯機":
				System.out.println( ones.matches("洗濯機") ? "洗濯機残り台数は" + random_num + "台です" : "");
				break;
			case "加湿器":
				System.out.println( ones.matches("加湿器") ? "加湿器残り台数は" + random_num + "台です" : "");
				break;
			case "テレビ":
				System.out.println( ones.matches("テレビ") ? "テレビ残り台数は" + random_num + "台です" : "");
				break;
			case "ディスプレイ":
				System.out.println( ones.matches("ディスプレイ") ? "ディスプレイ残り台数は" + random_num + "台です" : "");
				break;
			case "その他商品":
				System.out.println( ones.matches("その他商品") ? "『受け取った値』は指定の商品ではありません" : "");
				break;
			default:
				System.out.println("『受け取った値』は指定の商品ではありません");
			}
		}
	}
}