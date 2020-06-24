/*
Write a Program to accept a String as a command line argument and print a Welcome message as given below.

Example1)
C:\> java Sample John
O/P Expected : Welcome John

*/
public class question2{
    public static void main(String args[]){
        if(args.length == 1 ){
            System.out.println("Welcome "+args[0]);
        }
        else{
            System.out.println("Enter One word Name Only.");
        }
    }
}