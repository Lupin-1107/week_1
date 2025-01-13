import  java.util.Scanner; 
public class Reversearray{ 
    static int findlength(int number){ // static function that will calculate the length of the number
        int count=0;
        while(number!=0){
            count++; 
            number/=10;

        }
        return count;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one number"); 
        int value=sc.nextInt();
        int digitlength=findlength(value); // call the static function and put it as a length of the array
        int digit[]=new int[digitlength]; 
        int copiedNumber=value; 
        int index=0;
        while(copiedNumber!=0){ 
            digit[index]=copiedNumber%10; // reverse logic
            copiedNumber/=10; 
            index++;

        } 
        for(int i=0;i<=digit.length;i++){
            System.out.println(digit[i]+" ");// result
        } 
        sc.close();


        
    }

}