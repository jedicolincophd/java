/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeterminuscenter;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class PerimeterMinusCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        char choice;
        
        do
        {
            int row, sum=0, col, c=0, count=0, n=0;
            do
            {
                do
                {
                    //get row
                    System.out.print("Array row size: ");
                    row = input.nextInt();
                    //trap
                    if(row>50 || row%2==0 || row<=1)
                        System.out.println("Error: value should be odd and less than 50.");
                }while(row>50 || row%2==0 || row<=1);
                
                do
                {
                    //get column
                    System.out.print("Array column size: ");
                    col = input.nextInt();
                    //trap
                    if(col>50 || col%2==0 || col<=1)
                        System.out.println("Error: value should be odd and less than 50.");
                }while(col>50 || col%2==0 || col<=1);
            
                //check if row and column are equal
                if(row != col)
                    System.out.println("Error: row and column values are not equal.");
            }while(row != col);
        
            int intarr[][] = new int [row][col];
        
        
            //input values to array
            System.out.println("\nInput array values:");
            int i,j;
            for(i=0;i<intarr.length;i++)
                for(j=0;j<intarr[i].length;j++)
                {
                    intarr[i][j] = input.nextInt();
                    count++;
                }
        
            //display array integer value
            System.out.println("\nintarr values");
            for(i=0;i<intarr.length;i++)
            {
                for(j=0;j<intarr[i].length;j++)
                    System.out.print(intarr[i][j]+"\t");
                System.out.println();
            }
        
            //find center value
            c = (count/2)+1;
            System.out.print(c);
        
            //display sum perimiter
            System.out.print("\nsum of the perimeter values: ");
            for(i=0;i<intarr.length;i++)
            {
                for(j=0;j<intarr[i].length;j++)
                {
                    if(c!=count)
                    {
                        System.out.print(intarr[i][j]+"+");
                        sum+=intarr[i][j];
                    }
                    else
                    {
                        n = intarr[i][j];
                    }
                    c++;
                }
            }
            System.out.println("="+sum);
            
            System.out.println("Perimeter sum - center value: "+sum+" - "+n+" = "+(sum-n));
        
            System.out.print("Try again? [Y/N]? ");
            Scanner reader = new Scanner(System.in);
            choice = reader.next(".").charAt(0);
            choice = Character.toLowerCase(choice);
        }while(choice == 'y');
    }
    
}
