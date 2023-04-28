package lesson14;

public class lesson14 {

	public static void main(String[] args) {

		//string型の配列を作成し、アルファベットa～jまでを格納してください。
		//brake文を使用し、a～dまで表示してください。
		//出力結果：a
		//		    b
		//		    c
		//		    d

		//string型配列にa～jを格納 
		String value[] = { "a","b","c","d","e","f","g","h","i","j" };

		//while文でa～jのすべてを出力する処理
		int i = 0;
		while(true) {
			System.out.println(value[i]);
			i++;

		//dまで出力したら打ち止め
			if(i==4) {
				break;
			}
		}

		System.out.println();
		//cotinue文を使用し、i以外を表示してください。

		//出力結果：a
		//		    b
		//		    c
		//		    d
		//		    e
		//		    f
		//		    g
		//		    h
		//		    j

		//a～jのすべてを出力する処理
		for (int l = 0; l < 10; l++) {
		//iのみ出力しない
			if (l == 8) {
				continue;
			}
			System.out.println(value[l]);
		}
	}
}
