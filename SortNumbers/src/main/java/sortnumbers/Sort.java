package sortnumbers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	
	
	public static List<Object> sortList(List<Object> extractedList)
	{
		
		List<Object> SortedList = extractedList.stream().sorted().collect(Collectors.toList());
		
		List<Object> dSortedList=SortedList.stream().distinct().toList();
		
		return dSortedList;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Path path = Paths.get(System.getProperty("user.dir")).resolve("C:\\Users\\ACER\\Desktop\\sortinput.txt");
		BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
		List<String> Integers = new ArrayList<String>();
		String line = reader.readLine();

		while (line != null) {
			Integers.add(line);
			line = reader.readLine();
		}
		
		List<List<String>> CombinedList = Arrays.asList(Integers);
		
		List<Object> ExtractedList = CombinedList.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		
		
		sortList(ExtractedList).forEach(System.out::println);
		

	}
}