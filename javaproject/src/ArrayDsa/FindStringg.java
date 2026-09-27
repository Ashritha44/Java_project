package ArrayDsa;

import java.util.List;
import java.util.Arrays;

public class FindStringg {
public static void main(String[] args) {
	List<String> list= Arrays.asList("pen","paper","book","pencil");
	String target ="book";
	for(int i =0;i<list.size();i++) {
		if(list.get(i).equals(target))
		{
			System.out.println("found string :"+i);
			return;
		}
	}
	System.out.println("no element found");
}
}
