package Sample1;

public class Monster {
	String name = "モンスター";
	//攻撃
	public void attack(String name) {
		System.out.println(name + "の攻撃");
		System.out.println(name + "は20のダメージを与えた");
	}
	
	//逃亡
	public void escape(String name) {
		System.out.println(name + "は逃げ出した");
	}
}
