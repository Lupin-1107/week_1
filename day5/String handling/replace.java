import java.util.*;
public class replace{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	//write the sentence
	String sentence = "My domain language is language_name";
	//write the word you want to replace
	System.out.println("Enter the language name you want to show:-");
	String word = sc.nextLine();	
	
	String replace_str = sentence.replace("language_name" , word);
	
	System.out.println(replace_str);







}
}