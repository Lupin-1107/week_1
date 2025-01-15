import java.util.*;
public class frequent{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char frequent = ' ';
		int max_count = 0;

		for(int i = 0; i<str.length(); i++){
			int count = 0;
			for (int j = 0; j<str.length(); j++){
				if( str.charAt(i) == str.charAt(j) ){
					count++;
				
		}

		

		}
	
		if (count > max_count ){
			max_count = count;
			frequent = str.charAt(i);
		}

		}

		System.out.println("The most frequent character is:- " + frequent + "which occur:- " + max_count);
		












}
}