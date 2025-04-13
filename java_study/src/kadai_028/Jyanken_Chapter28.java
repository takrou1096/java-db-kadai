package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			while(true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if(!input.equals("r")&&!input.equals("s")&&!input.equals("p")){	
				System.out.println(input);
				
			}else{
				System.out.println("r,s,pで入力してください。");
				scanner.close();
				return input;
			}
			}
		}
	
	public String getRandom() {
		String[] jankenArray = {"r" ,"s" ,"p"};
		int randomIndex = (int) (Math.floor(Math.random() * jankenArray.length));
		return jankenArray[randomIndex];
	}
	
	public void playGame(String myChoice ,String random) {
		//自分と相手の手を出力
		HashMap<String ,String> janken = new HashMap<>();
		janken.put("r" ,"グー");
		janken.put("s" ,"チョキ");
		janken.put("p" ,"パー");
		System.out.println("自分の手は" + janken.get(myChoice) +"対戦相手の手は" + janken.get(random));
		
		if((myChoice.equals("r") && random.equals("s")) || (myChoice.equals("s") && random.equals("p")) || (myChoice.equals("p")&&random.equals("r"))) {
			System.out.println("自分の勝ちです"); 	
		}else if((myChoice.equals("r") && random.equals("p")) || (myChoice.equals("s") && random.equals("r")) || (myChoice.equals("p")&&random.equals("s"))){
			System.out.println("自分の負けです");	
		}else {
			System.out.println("あいこです");
		}
	}
}
