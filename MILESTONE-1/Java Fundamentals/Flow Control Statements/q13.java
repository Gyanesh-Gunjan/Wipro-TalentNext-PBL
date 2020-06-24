/*
Write a program to print prime numbers between 10 and 99.
*/

public class q13{
    static int prime(int n){
        for(int i=2;i*i<=n;i++)
            if(n%i == 0)
                return 0;
        return 1;
    }

    public static void main(String args[]){
        for(int i=10;i<=99;i++){
            if(prime(i)== 1)
                System.out.println(i);
        }
    }
}