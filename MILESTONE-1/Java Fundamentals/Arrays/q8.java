/**
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10

 */
import java.util.*;
public class q8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n < 100) of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int total_sum = 0;
        int temp_sum = 0, flag = 1;
        for(int i=0;i<n;i++){
            if(arr[i] == 6){
                int j = 0;
                for(j=i;j<n;j++){
                    if(arr[j] == 7){
                        flag = 0;
                        i = j;
                        break;
                    }
                    else temp_sum += arr[j];
                }
                i = j;
            }
            else 
                total_sum += arr[i];
        }
        if(flag == 1) total_sum += temp_sum;
        System.out.println(total_sum);
    }
}
