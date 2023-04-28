package lesson13;

public class lesson13_2 {

	public static void main(String[] args) {
		/*
		①配列aを作成し、1～5を格納してください。
		
		②参照型配列bを作成し、3を表示してください。
			出力結果：3
			
		③配列a[3]を10で上書きし表示してください。
			出力結果：10
			
		④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
			出力結果：配列aの要素数は、５です。
		*/
		//配列aに１～５の値を格納
		int a[] = new int[]{1,2,3,4,5};
		
		//参照配列bを作成、出力
		int b[] = a;
		System.out.println(b[2]);
		
		//a[3]に10を上書き、出力
		a[3] = 10;
		System.out.println(a[3]);
		
		//要素数を出力
		System.out.println("配列の要素数は、" + a.length + "です。");
	}
}
