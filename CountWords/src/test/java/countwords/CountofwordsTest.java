package countwords;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;


public class CountofwordsTest {
	
	
	@Test
	public void ifWordsAreGivenShouldReturnTheCountOfEachWord() throws FileNotFoundException
	{
		Map<String, Integer> words = new HashMap<String, Integer>();
		
		Map<String, Integer> vwords=new HashMap<String, Integer>();
		
		vwords.put("reference", 1);
		vwords.put("a", 1);
		vwords.put("that", 1);
		vwords.put("purpose", 1);
		vwords.put("and", 1);
		vwords.put("document", 1);
		vwords.put("this", 1);
		vwords.put("only", 1);
		vwords.put("for", 1);
		vwords.put("is", 2);
		vwords.put("it", 1);
		
		 assertEquals(vwords,Countofwords.CountEachWords("C:\\Users\\Nayana\\Downloads\\reference1.txt", words));
	}

}
