
import java.util.Scanner;

public class MeanHeightPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double[] Playerheight = new double[11];
        double sum = 0; // sum variable to calculate the total height sum of player
        for (int i = 0; i < 11; i++) {
            double height = sc.nextDouble();
            Playerheight[i] = height;// store the value of height of player in array
        }
        for (int i = 0; i < 11; i++) {
            sum += Playerheight[i];// do the sum of Playerheight
        }
        double mean = sum / 11; // calculate the mean value by dividing the sum and total number of player
        System.out.println("The mean value of the player is" + mean + " ");// result the value
        sc.close();
    }
}
