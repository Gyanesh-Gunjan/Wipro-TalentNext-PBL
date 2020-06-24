/*
Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]

*/
import java.util.*;
public class q9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n < 100) of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 10)
                arr[idx++] = arr[i]; 
        }
        for(int i = idx;i<n;i++) arr[i] = 0;

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" "); 
    }
}