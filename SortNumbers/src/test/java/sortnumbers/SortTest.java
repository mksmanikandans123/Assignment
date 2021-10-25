package sortnumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class SortTest {
	
	@Test
	public void givenElementsToSortThenShouldReturnSortedElements()
	{
		List<Object> extractedList=List.of(78, 9, 45, 23, 89);
		
		List<Object> dSortedList=List.of(9,23,45,78,89);
		
		assertEquals(dSortedList, Sort.sortList(extractedList));
	}

}
