package lesson4;

public class lesson4 {

	public static void main(String[] args) {

		// Q1 下記9個をローカル変数として宣言のみしてください
		
		//・バイト型・短整数型・整数型・長整数型
		byte byte_number;
		short short_number;
		int int_number;
		long long_number;
		
		//・単精度浮動小数点数型・倍精度浮動小数点数型
		float float_number;
		double double_number;
		
		//・文字型・文字列型
		char char_value;
		String String_value;
		
		//・ブーリアン型 
		boolean boolean_judge;
		
		//Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		byte_number = 1;
		short_number = 1;
		int_number = 1;
		long_number = 1;
		float_number = 1;
		double_number = 1;
		char_value = ' ';
		String_value = " ";
		boolean_judge = false;

		//Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		//・バイト型                 
		//10
		byte_number = 10;

		//・短整数型                 
		//100
		short_number = 100;

		//・整数型                	 
		//1000
		int_number = 1000;

		//・長整数型                 
		//10000
		long_number = 10000;

		//・単精度浮動小数点数型   	 
		//9.5
		float_number = (float) 9.5;

		//・倍精度浮動小数点数型		 
		//10.5
		double_number = 10.5;

		//・文字型                   
		//a
		char_value = 'a';

		//・文字列型              	 
		//ハロー
		String_value = "ハロー";

		//・ブーリアン型          	 
		//true
		boolean_judge = true;

		//Q4 下記の通りにコンソール出力されるようにしてください
		//必ず変数を使用すること

		// 11110
		long answer1 = byte_number + short_number + int_number + long_number;
		System.out.println(answer1);

		// 20.0
		double answer2 = float_number + double_number;
		System.out.println(answer2);

		// a ハロー true
		StringBuilder answer3 = new StringBuilder("a");
		answer3.append(String_value);
		answer3.append(boolean_judge);
		System.out.println(answer3);

		// 11130.0                    
		//数字を全て足す
		double answer4 = answer1 + answer2;
		System.out.println(answer4);

		// 10000000000                
		//小数点以外の数字を全てかける
		long answer5 = byte_number * short_number * int_number * long_number;
		System.out.println(answer5);

		// 0.105                      
		//10.5割る100をする
		double answer6 = double_number / short_number;
		System.out.println(answer6);

		// -90                        
		//10引く100をする
		int answer7 = byte_number - short_number;
		System.out.println(answer7);

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。
		//正しく動作するように修正してください。
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

	}

}
