/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char choice;
        boolean j,t;
        
        do{
            String original, reverse = "";
            Scanner in = new Scanner(System.in);
           
            System.out.println("Input: ");
            original = in.nextLine();
            
            int length = original.length();
            
            for ( int i = length - 1 ; i >= 0 ; i-- )
                reverse = reverse + original.charAt(i);
 
            boolean same = original.equalsIgnoreCase(reverse);
            if(same)
                System.out.println("Yes! It is a palindrome.");
            else
                System.out.println("No, it is not a palindrome.");
            
            do{
                System.out.print("Try again? [Y/N]? ");
                Scanner reader = new Scanner(System.in);
                choice = reader.next(".").charAt(0);
                choice = Character.toLowerCase(choice);
                t = Character.isLetter(choice);
                if(choice!='y'||choice!='n')
                    t = true;
            }while(!t);
        }while(choice == 'y');
        System.out.println("Goodbye");
    }
}
