import java.util.*;
public class palindrome {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] chararry = str.toCharArray();

        int left = 0 , right = chararry.length - 1;

        while(left < right){
            char temp = chararry[left];
            chararry[left] = chararry[right];
            chararry[right] = temp;

            left++;
            right--;
        }

        String final_str = new String(chararry);
        if (str.equals(final_str)){
            System.err.println("Yes this string is palindrome");
        }
        else{
            System.out.println("Both string are not equal");
        }

    }
}
