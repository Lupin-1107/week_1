import java.util.*;
public class remove_char{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = sc.next().charAt(0);

		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i<sb.length(); i++){
			if (sb.charAt(i) == c){
				sb.deleteCharAt(i);
				i--;
			}	
		
}
		System.out.println("The resultant string after removing the specific character is:- " + sb.toString());

}
}