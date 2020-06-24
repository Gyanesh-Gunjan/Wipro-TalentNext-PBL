/*
A) Write a program to check if a given integer number is Positive, Negative, or Zero. 

B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
*/

import java.util.*;
public class q1_b{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int num1 =  sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 =  sc.nextInt();
        
        if(num1%10 == num2%10)
            System.out.println("true");
        else
            System.out.println("false"); 
    }
}