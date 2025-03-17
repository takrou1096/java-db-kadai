package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void referer(String[] word) {
		HashMap<String,String> dictionary = new HashMap<>();
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	
		String result = "";
		for(int i = 0; i < word.length; i++) {
			result = dictionary.get(word[i]);
			if (result == null) {
				System.out.println(word[i] + "は辞書に存在しません");
			}else {
				System.out.println(word[i] + "の意味は" + result);
			}
		}
	}
}
