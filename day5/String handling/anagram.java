import java.util.*;
public class anagram{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		//convert to chararray then sort then convert back to string
		char[] chararry1 = str1.toCharArray();
		Arrays.sort(chararry1);
		String final_str1 = new String(chararry1);

		char[] chararry2 = str2.toCharArray();
		Arrays.sort(chararry2);
		String final_str2 = new String(chararry2);

		if (final_str1.equals(final_str2)){
			System.out.println("Both the string are anagram");
		}

		




















}
}