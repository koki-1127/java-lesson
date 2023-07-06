package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dogName = new Dog(null);
		System.out.println(dogName.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dogNum = new Dog(0);
		System.out.println(dogNum.num);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date dateObj = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 指定の形式で取得の後、出力
		String display = format.format(dateObj);
		System.out.println(display);
	}
}