package lesson13;

public class lesson13_1 {

	public static void main(String[] args) {
		/*
		int型の配列aを作成してください。
		配列aに1～5の数字を格納してください。
		繰り返し処理を使用し、
		配列aの数字を順番に表示させてください。

		出力結果：1
				  2
				  3
				  4
				  5
		 */
		/*
		int score[] = new int[5];
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		*/
		
		// 配列に1～5の数字を格納
		int a[] = new int[]{1,2,3,4,5};
		//繰り返し処理で出力
		for(int i=0; i<5; i++){
            System.out.println(a[i]);  
		}
	}
}
