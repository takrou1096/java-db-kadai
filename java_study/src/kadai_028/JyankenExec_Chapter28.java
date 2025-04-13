package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
        // Janken クラスのインスタンスを作成
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();
		Scanner scanner = new Scanner(System.in);
		String user = janken.getMyChoice();
		String oppnent = janken.getRandom();
		janken.playGame(user, oppnent);
		scanner.close();
	}
}
