package lesson18;

import java.util.Random;

public class lesson1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	public static void print_data(String ones,int value) {
		
		// メッセージ表示
		System.out.println(ones + value + "\n");
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	
	public static void calculation(int num1, int num2) {
		
		// 掛け算でメッセージ表示
        System.out.println(num1 * num2 + "\n");
    }
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	
	public static void numbers(int[] box) {
		
		for (int i = 0; i < box.length; i++){
			
			// メッセージ表示
	        System.out.println(box[i]);
	        }
    }
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	
	public static void calculation(double num1, double num2) {
		
		// 和算の式を変数に代入
		double num3 = num1 + num2;
		
		// 和算でメッセージ表示
		System.out.println("\n" + num3 + "\n");
    }
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	public static int[] random_numder(int count) {
		
		// 配列の宣言
		int[] array = new int[count];
		
		// ランダムな数字を格納する配列の宣言
		for (int i = 0; i < count; i++) {

			// ランダムの宣言
			Random random_num = new Random();
			
			// ランダムに1～100を生成
	        array[i] = random_num.nextInt(100)+1;
	        
			// メッセージ表示
			System.out.println(array[i]);
		}
		// 処理の返り値を設定
		return array ;
	}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、
	// 受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	public static double average(int[] array) {
		
		// 合計値の宣言
		double sum = 0;
		
		// 合計値を出す処理
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // 平均値を出す処理
        double avg = sum / array.length;
        
        // メッセージ表示
        System.out.println("\n" + avg + "\n");
        
        // 平均値を返り値に設定
		return avg;
    }
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、
	// 受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	
	public static void decide(double dec) {
		
		// boolean型の変数を宣言
		boolean judge = false;
		
		// 受け取った値が50以上の場合の条件式
		judge = (dec >= 50); 
	    
		// 条件式を元に出力を変更する処理
		if (judge) { 
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// Q1
		print_data("Hello JavaSE ", 11);
		
		// Q2
		calculation(11,3);
		
		// Q3
		int[] box = {3,3,3};
		numbers(box);
		
		// Q4
		calculation(42.2,2.4);
		
		// Q5
		int[] avg = random_numder(3);
		
		// Q6
		double dec = average(avg);
	
		// Q7
		decide(dec);
	}
}
