package kadai_028;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("ジャンケンの手を入力してください。");
			String input = scanner.next();
			if(!input.equals("r")||!input.equals("s")||!input.equals("p")){	
				System.out.println("r,s,pで入力してください。");
			    continue;
			}else{
				scanner.close();
				return input;
			}
		}
	}
	
	public String getRandom() {
		String[] jankenArray = {"r" ,"s" ,"p"};
		int randomIndex = (int) (Math.random() * jankenArray.length);
		return jankenArray[randomIndex];
	}
	
	public
}
