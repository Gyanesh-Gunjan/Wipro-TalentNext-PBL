/*
Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome

*/


import java.util.*;
public class q17{
    public static void main(String args[]){
        if(args.length == 1){
            int i = 0, n = args[0].length()-1;
            int f = 1;
            while(i<=n){
                if(args[0].charAt(i) != args[0].charAt(n)){
                    f = 0;
                    break;
                }
                i++;
                n--;
            }
            if(f==1)
                System.out.println("Palindrome");
            else 
                System.out.println("Not Palindrome");
        }
    }
}