/*
A) Write a program to check if a given integer number is Positive, Negative, or Zero. 

B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
*/

import java.util.*;
public class q1_a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num =  sc.nextInt();
        if(num > 0)
            System.out.println("Positive");
        else if(num < 0)
            System.out.println("Negative");
        else 
            System.out.println("Zero");
    }
}