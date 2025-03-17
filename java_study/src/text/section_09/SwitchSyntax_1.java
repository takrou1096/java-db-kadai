package text.section_09;

public class SwitchSyntax_1 {
	public static void main(String[] args) {
		
		int randNum = (int)(Math.random() * 10);
		System.out.println(randNum);
		switch(randNum) {
		
		case 9 -> System.out.println("大当たりです");
		case 8 -> System.out.println("当たりです");
		default -> System.out.println("はずれです");
		}
	}

}
