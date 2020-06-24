/*
Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/


import java.util.*;
public class q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println("Alphabet");
        else if(ch >= 48 && ch <= 57)
            System.out.println("Digit");
        else 
            System.out.println("Special Character");
    }
}