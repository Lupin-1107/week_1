import java.util.*;
public class reverse{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        int left = 0 , right = sb.length() - 1;
        
        while(left < right){
           char temp = sb.charAt(left);
           sb.setCharAt(left , sb.charAt(right));
           sb.setCharAt(right , temp);
           left++;
           right--;
        }
        System.out.println(sb.toString());



    }
}