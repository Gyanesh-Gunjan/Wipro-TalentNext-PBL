/*
Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a

*/


import java.util.*;
public class q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        if((ch >= 65 && ch <= 90)){
            char ch1 = (char)(97+(ch-65));
            System.out.println(ch1);
        }
        else{
            char ch1 = (char)(65+(ch-97));
            System.out.println(ch1);
        }
    }
}