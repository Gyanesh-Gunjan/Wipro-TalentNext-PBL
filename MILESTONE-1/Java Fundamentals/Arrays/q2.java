/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
*/

import java.util.*;
public class q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n < 100) of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max) 
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Maximum value of the array : "+ max);
        System.out.println("Minimum value of the array : "+ min);
        
    }
}

/*
Enter size (n < 100) of the array : 5
Enter the elements of the array :
2 3 4 5 6
Maximum value of the array : 6
Minimum value of the array : 2
*/