package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		//Carインスタンス
		Car_chapter15 car = new Car_chapter15();
		car.gearChange(3);
		
		//らんメソッドを呼び出し
		car.run();
		
		Car_chapter15 car2 = new Car_chapter15();
		car2.gearChange(2);
		car2.run();
	}
}

//メモ
