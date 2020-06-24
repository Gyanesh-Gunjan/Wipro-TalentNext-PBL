/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/

import java.util.*;
public class q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n < 100) of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        // sorting 
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("First Max : "+arr[n-1]);
        System.out.println("First Min : "+arr[0]);
        if(n >= 2){
            System.out.println("Second Max : "+arr[n-2]);
            System.out.println("Second Min : "+arr[1]);
        }
    }
}

/*
Enter size (n < 100) of the array : 9
Enter the elements of the array :
2 19 7 8 4 5 -8 -78 567
First Max : 567
First Min : -78
Second Max : 19
Second Min : -8
*/
