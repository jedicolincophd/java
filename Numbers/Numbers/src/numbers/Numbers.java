/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jedidiah Jan Colinco
 */
public class Numbers {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char choice;
        String[] words = {"Eight", "Eighteen", "Eleven", "Fifteen", "Five",
                        "Four", "Fourteen", "Nine", "Nineteen",  "One",
                        "Seven", "Seventeen", "Six", "Sixteen", "Ten",
                        "Thirteen", "Three", "Twelve", "Twenty", "Two"};
       
        int[] num = {8,18,11,15,5,4,14,9,19,1,7,17,6,16,10,13,3,12,20,2};
       
        do
        {
            int i, j, k;
            int count = 0;
            int n[] = new int [10];
            int r[] = new int [10];
            String[] w = new String[10];
            int c = 0, x = 0, z = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("Integer collection to sort: ");
            for(i = 0; i < 10; i++)
            {
                int in = 1;
                int d;
                while (!s.hasNextInt())
                {
                    System.out.print("Program only accepts numeric values.\n");
                    s.next();
                }
                d = s.nextInt();
                if(d == 0)
                    break;
                else if(d > 19)
                {
                    System.out.println("Error: Only numbers from 1-19 are accepted.");
                    continue;
                }
                else
                {
                    for(k = i; k >= 0; k--)
                    {
                        if(n[k]==d)
                        {
                            System.out.println("Error: duplicate input.");
                            in = 0;
                        }
                    }
                }
                if(in!=0)
                {
                    n[z] = d;
                    z++;
                }
            }
            
            for(j = 0; j < 20; j++)
                for(i = 0; i < 10; i++)    
                {
                    if(num[j] == n[i])
                    {
                        r[c] = num[j];
                        c++;
                        break;
                    }
                }
           
            for(i = 0; i < n.length; i++)
            {
                if(n[i]==0)
                    continue;
                for(j = 0; j < num.length; j++)
                {
                    if(n[i] == num[j])
                    {
                        w[x] = words[j];
                        x++;
                        break;
                    }
                }
            }
           
            for(j = 0; j < n.length; j++)
            {
                if(n[j]!=0)
                {
                    System.out.println(n[j]+" = "+w[j]);
                }
            }
           
            System.out.println("Sorted integer collection: ");
            for(i = 0; i < r.length; i++)
            {
                if(r[i]!=0)
                {
                    System.out.print(r[i]+" ");
                }
            }
               
            System.out.println("\nTry Again [y/n]: ");
            Scanner reader = new Scanner(System.in);
            choice = reader.next().charAt(0);
            choice = Character.toLowerCase(choice);
        }while(choice == 'y' || choice == 'Y');
    }
}