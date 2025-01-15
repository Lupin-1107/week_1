import java.util.*;
public class lower_upper_case{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
	
		StringBuilder toggle = new StringBuilder();

		for(int i = 0; i<str.length(); i++){
			char c = str.charAt(i);
			if ( Character.isUpperCase(c)){
				toggle.append(Character.toLowerCase(c));
}
			else if (Character.isLowerCase(c)){
				toggle.append(Character.toUpperCase(c));
}
			else{
				toggle.append(c);
}

}
		System.out.println("The updated string in toggle way is:- " + toggle.toString());		
	












}
}