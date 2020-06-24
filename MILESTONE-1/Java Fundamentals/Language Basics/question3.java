/*
Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30
*/

public class question3{
    public static void main(String args[]){
        if(args.length == 2 ){
            int first_Number = Integer.parseInt(args[0]);
            int second_Number = Integer.parseInt(args[1]);
            int total_sum = first_Number + second_Number;
            System.out.println("The sum of "+first_Number+" and "+ second_Number+ " is "+total_sum);
        }
        else{
            System.out.println("Enter Two Numbers");
        }
    }
}