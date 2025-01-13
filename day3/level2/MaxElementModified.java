
import java.util.Scanner;

public class MaxElementModified {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Create a number variable and Take user input.
        System.out.println("Enter the digit"); //Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
        int number=sc.nextInt(); 
        int maxDigit=10; 
        int array[]=new int[maxDigit];
        int index=0;
        while(number!=0){ 
            if(index==maxDigit){
                maxDigit*=2;  // resize the array
                int temp[]=new int[maxDigit];// 
                for(int i=0;i<array.length;i++){
                    temp[i]=array[i];
                }
                array=temp;
            }
                
                array[index]=number%10; // logic of finding the array
                number/=10;  
                index++;
            }
            


        
        int largestDigit=0; // define two var namely largestdigit and secondLargestdigit;
        int secondLargestDigit=0; 
        for(int i=0;i<array.length;i++){
            if(array[i]>largestDigit){
                largestDigit=array[i];// largest digit;
            } 
            else if(array[i]<largestDigit&&array[i]>secondLargestDigit){
                secondLargestDigit=array[i];// second largst digit
            }
        }
        // print result
        
        System.out.println("The largest digit in the array is "+largestDigit); 
        System.out.println("The second largest element in the array is"+secondLargestDigit);
        sc.close();

        
    }
    
}
