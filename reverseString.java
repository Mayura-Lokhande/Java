package string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Jai Gora";
		String revStr = "";
		char[] characters = str.toCharArray();
		StringBuilder revStringBuilder = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			revStringBuilder.append(arr[i]);
		}
		System.out.print(revStr);

	}

}
