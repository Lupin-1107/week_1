import java.util.*;
// package Level1;

public class longest_word {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        //split the string into words
        String[] word = str.split(" ");

        String longest_word = "";
        int word_length = 0;

        for(String i:word){
            if (i.length() > word_length){
                word_length = i.length();
                longest_word = i;
            }
        }
        System.out.println("The longest word in a sentence is:- " + longest_word);


    }
    
}
