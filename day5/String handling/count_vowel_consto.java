import java.util.*;
public class count_vowel_consto{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count_vow = 0;
		int count_const = 0;
		for(int i = 0; i<str.length(); i++){
			if((str.charAt(i) == 'a') || (str.charAt(i) == 'A') || (str.charAt(i) == 'e') || (str.charAt(i) == 'E') || (str.charAt(i) == 'i') || (str.charAt(i) == 'I') || (str.charAt(i) == 'o') || (str.charAt(i) == 'O') || (str.charAt(i) == 'u') || (str.charAt(i) == 'U')  ){
count_vow++;

}
else{
count_const++;
}
}
System.out.println("The number of constonent in the sentene is:- " + count_const);
System.out.println("The number of vowel in the sentence is:- " + count_vow);




}
}