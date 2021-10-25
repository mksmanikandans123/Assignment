package countwords;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Countofwords {
	static Map<String,Integer> CountEachWords(String filename, Map<String, Integer> words) throws FileNotFoundException {
		Scanner file = new Scanner(new File(filename));
		while (file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);
			if (count != null)
				count++;
			else
				count = 1;
			words.put(word, count);
		}
		file.close();
		
		return words;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> words = new HashMap<String, Integer>();
		CountEachWords("C:\\Users\\Nayana\\Downloads\\reference1.txt", words);
		System.out.println(words);
	}
}