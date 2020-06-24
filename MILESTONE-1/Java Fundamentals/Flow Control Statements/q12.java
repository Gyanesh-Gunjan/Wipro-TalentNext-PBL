/*
Write a program to check if a given number is prime or not.
*/


import java.util.*;
public class q12{
    static int prime(int n){
        for(int i=2;i*i<=n;i++)
            if(n%i == 0)
                return 0;
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        if(prime(n)==1)
            System.out.println("Prime");
        else 
            System.out.println("Not Prime");
    }
}