package msAccademyAssignment;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuredCharacter {

	public static void main(String[] args) {
		String str = "programmming";
		Map<Character, Integer> map=new HashMap<>();
		for(char c: str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		char maxChar=' ';
		int maxCount=-1;
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			if(m.getValue() > maxCount) {
				maxChar=m.getKey();
				maxCount=m.getValue();
			}
		}
		
		System.out.println("Maximum Occured character is=> "+maxChar+" and count is=> "+maxCount);
	}

}
