/*
Write a program to initialize an integer array and print the sum and average of the array.
*/

import java.util.*;
public class q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n < 100) of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // calcuating total sum
        int total_sum = 0;
        for(int i=0;i<n;i++) {
            total_sum+=arr[i];
        }
        float avg = (float)total_sum/n;

        System.out.println("Total sum : "+total_sum);
        System.out.println("Average : "+avg);
    }
}

/*
Enter size (n < 100) of the array : 5
Enter the elements of the array :
1 2 3 4 5
Total sum : 15
Average : 3.0

*/