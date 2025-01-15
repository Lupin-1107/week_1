import java.util.*;

public class duplicate_remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++){
            for(int j = i + 1; j < sb.length(); j++){
                if (sb.charAt(i) == sb.charAt(j)){
                    sb.deleteCharAt(j);
                }
            }
        }


        System.out.println(sb.toString());
    }
}
