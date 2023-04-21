
package lesson5;

public class lesson5 {

	public static void main(String[] args) {

		// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//  ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』

		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」

		// Q1を下記に記載
		String name, age, height, weight, like;
		name = "山田太郎";
		age = "１８歳";
		height = "170.5㎝";
		weight = "62.2kg";
		like = "寿司";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "です");
		System.out.println("体重は" + weight + "です");
		System.out.println("好きな食べ物は" + like + "です");

		// Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること

		// Q2を下記に記載
		double height2, weight2;
		height2 = 1.70;
		weight2 = 62;
		double d1 = weight2 / (height2 * height2);
		double roundDb1 = Math.floor(d1 * 10.0) / 10.0;
		System.out.println("BMIは" + roundDb1 + "です");
		System.out.println();

		// Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です

		// Q3を下記に記載
		name = "鈴木一郎";
		age = "24歳";
		height = "168.5㎝";
		weight = "64.2kg";
		like = "オムライス";
		height2 = 1.68;
		weight2 = 64;
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "です");
		System.out.println("体重は" + weight + "です");
		System.out.println("好きな食べ物は" + like + "です");

		double d2 = weight2 / (height2 * height2);
		double roundDb2 = Math.floor(d2 * 10.0) / 10.0;
		System.out.println("BMIは" + roundDb2 + "です");

		// ↓↓コンソール最終結果↓↓

		//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です

	}

}
