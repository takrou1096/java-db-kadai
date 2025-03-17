package Sample1;

public class Main {
	public static void main(String[] args) {
		Monster mt = new Monster();
		mt.attack(mt.name);
		mt.escape(mt.name);
		
		System.out.println("---------------");
		
		Slime sm = new Slime();
		sm.attack(sm.name);
		sm.jump();
		sm.escape(sm.name);
	}
}
