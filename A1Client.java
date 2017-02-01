// Program: A1
// Written by:Patrick Dempsey
// Description:program takes a number and changes it to a list
//of five sperate numbers
// Challenges:: syntax errors that i didnt understand what they meant
// Time Spent:1 hour
// Given Input:               Expected Output:
// --------------------          -------------------------
//12345                          1 2 3 4 5                
//98765                          98765
//13523                          13523
//                   Revision History
// Date:   2/16/16               By: Pat              Action:Finshed
// ---------------------------------------------------
// 01/31/2014         (initals)       Created

 

package a1;

import java.util.Scanner;

public class A1Client
{
         
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int digi1, digi2, digi3, digi4, digi5;

        System.out.print("Enter a number with 5 digits: ");
       
        int number = in.nextInt();
        
        digi1 = number / 10000;
        digi2 = (number % 10000) / 1000;
        digi3 = ((number % 10000) % 1000) / 100;
        digi4 = (((number % 10000) % 1000) % 100) / 10;
        digi5 = (((number % 10000) % 1000) % 100) % 10;

        System.out.printf("%d%s%d%s%d%s%d%s%d%n",digi1, " ", digi2, " ", digi3, " ", digi4, " ", digi5);
    }
    
    
    
  
  /*end main method*/
 }/*end class A1Client*/

