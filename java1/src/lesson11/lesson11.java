package lesson11;

public class lesson11 {

	public static void main(String[] args) {
		/*
		問題．switch文を使用し、以下のプログラムを作成してください。
		変数に数値を代入
				
		①2の場合は、「（変数）月は28日です。」
		出力結果：2月は28日です。
				
		②4，6，9，11の場合は、「（変数）月は30日です。」
		出力例：4月は30日です。
				
		③その他の場合は、「（変数）月は31日です。」
		出力例：1月は31日です。
		 */
		//変数に１を代入
        int num =1;
 
        switch(num) {
        case 1:
            System.out.println(name + "さんは総務部所属です。");
            break;//処理を中断してswitch文から抜けだす。
        case 2:
            System.out.println(name + "さんは人事部所属です。");
            break;//処理を中断してswitch文から抜けだす。
        case 3:
            System.out.println(name + "さんは営業部所属です。");
            break;//処理を中断してswitch文から抜けだす。
        default:
            System.out.println(name + "さんの所属は未登録です。");
        }

	}

}
