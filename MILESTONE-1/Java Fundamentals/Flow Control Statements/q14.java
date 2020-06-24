/*

Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10

*/


import java.util.*;
public class q14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int DigitSum = 0;
        while(n>0) {
            DigitSum += (n%10);
            n /= 10;
        }
        System.out.println(DigitSum);
    }
}