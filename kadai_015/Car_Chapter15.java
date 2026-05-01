package kadai_015;

public class Car_Chapter15 {
	//フィールドの内部データ
	private int gear = 1;
	private int speed = 10;
	
	//コンストラクタ(初期化処理)
	public Car_Chapter15(int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//ギアの値により速度を変える
	public void changeGear (final int afterGear) {
		switch(afterGear) {
		case 1 -> {System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		           speed = 10;
		}
		case 2 -> {System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		speed = 20;
		}
		case 3 -> {System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		speed = 30;
		}
		case 4 -> {System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		speed = 40;
		}
		case 5 -> {System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		speed = 50;
		}
		default -> {System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		speed = 10;
		}
		}
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
