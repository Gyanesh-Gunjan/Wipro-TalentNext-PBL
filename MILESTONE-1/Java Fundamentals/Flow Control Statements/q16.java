/*
Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001

*/


import java.util.*;
public class q16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}