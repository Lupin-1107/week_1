import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of Amar: ");
        int amar_age = scanner.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int akbar_age = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int anthony_age = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();
        int youngestAge = Math.min(amar_age, Math.min(akbar_age, anthony_age));
        String youngestFriend = (youngestAge == amar_age) ? "Amar" 
                               : (youngestAge == akbar_age) ? "Akbar" : "Anthony";
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" 
                                : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

    
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");
        scanner.close();
    }
}