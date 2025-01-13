import java.util.Scanner;

public class YoungestFriends {
    public static void main(String[] args) {
        // Create arrays to store the names, ages, and heights of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];
        
        Scanner sc = new Scanner(System.in);

        // Take user input for age and height of the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextInt();
        }

        // Initialize variables to track the youngest and tallest
        int youngestAge = Integer.MAX_VALUE;
        int tallestHeight = Integer.MIN_VALUE;
        String youngestFriend = "";
        String tallestFriend = "";

        // Loop through the array to find the youngest and tallest
        for (int i = 0; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestFriend = names[i];
            }
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestFriend = names[i];
            }
        }

        // Display the youngest and tallest
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight);
        
        sc.close();
    }
}
