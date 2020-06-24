/*
Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}

*/
import java.util.*;
public class q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n < 100) of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int unique[] = new int[100];
        int idx = 0;
        int garbage_value = -10000;
        for(int i=0;i<n;i++){
            if(arr[i] != garbage_value){
                unique[idx++] = arr[i];
                for(int j=i+1;j<n;j++){
                    if(arr[i] == arr[j]){
                        arr[j] = garbage_value;
                    }
                }
            }
        }

        System.out.println("Unique value : ");
        for(int i=0;i<idx;i++)
            System.out.print(unique[i]+" ");
    }
}
