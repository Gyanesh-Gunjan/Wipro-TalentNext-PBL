/*
Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true

*/


import java.util.*;
public class q11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n < 100) of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int four = 0, one = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 4) four++;
            else if(arr[i] == 1) one++;
        }
        
        if(four + one == n)
            System.out.println("true");
        else 
            System.out.println("false"); 
    }
}
