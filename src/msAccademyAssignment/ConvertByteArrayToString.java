package msAccademyAssignment;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ConvertByteArrayToString {
	
	public static void main(String[] args) {

		//Approach one
		byte[] byteArray = {72, 101, 108, 108, 111}; // Represents "Hello"
		String str = new String(byteArray);
		System.out.println(str); // Output: Hello
		
		//Approach Second
		try {
			str=new String(byteArray, "UTF-8");
			System.out.println(str); // Output: Hello
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//Approach Third
		str =new String(byteArray, StandardCharsets.UTF_8);
		System.out.println(str); // Output: Hello
	}


}
