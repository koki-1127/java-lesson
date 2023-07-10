package lesson23;

import java.util.Objects;

public class Animal {

	/*
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください

	動物名：ライオン
	体長：2.1m
	速度：80km/h
	 */
	
	// フィールド変数
	private String name;
	private String length;
	private String speed;
	
	// setter
	public void setName(String name) {
	    this.name = name;
	}
	public void setLegth(String length) {
	    this.length = length;
	}
	public void setSpeed(String speed) {
	    this.speed = speed;
	}

    // Getter
	public String getName() {
		return this.name;
	}
	public String getLegth() {
		return this.length;
	}
	public String getSpeed() {
		return this.speed;
	}
    
	public static void main(String[] args) {
		
		// lionクラスをインスタンス化
		Animal lion = new Animal();
		
		// setterメソッドに値をそれぞれ渡す
		lion.setName("ライオン");
		lion.setLegth("2.1m");
		lion.setSpeed("80km/h");
		
		// null判定をして出力処理
		String checkNull = null;
		
		// nullの場合はnul表記、getterメソッドでsetterでセットした値を取得し出力する
		if (Objects.nonNull(lion)) {
			System.out.println(lion.getName());
			System.out.println(lion.getLegth());
			System.out.println(lion.getSpeed());
		} 
		else {
			System.out.println(checkNull);
		}
	}
}

