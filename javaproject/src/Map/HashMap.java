package Map;

import java.util.HashMap;
import java.util.Map;
public class HashMap {
public static void main(String [] args) {
	String str = "abc";
	Map<character,Integer>map = new HashMap<>();
	for(int i = 0; i < str.length();i++){
		Char ch = dtr.charAt(i);
		if(hMap.containskey(ch)) {
			hMap.put(ch,hmap.get(ch)+ 1);
		}
		else {
			hmap.put(ch,1);
		}
		for(map.entry<character,Integer>entry:hMap.entrySet());
		System.out.println(entry.getkey()+ entry.getvalue());
	}
}
}
