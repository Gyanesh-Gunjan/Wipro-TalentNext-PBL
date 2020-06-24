/**
 Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

 */


import java.util.*;
public class q12{
    static int[] middleWay(int a[], int b[]){
        int c[] = new int[2];
        c[0] = a[1];
        c[1] = b[1];
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First array : ");
        int arr[] = new int[3];
        for(int i=0;i<3;i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter second array : ");
        int arrb[] = new int[3];
        for(int i=0;i<3;i++)
            arrb[i] = sc.nextInt();

        int mid_arr[] = middleWay(arr, arrb);

        System.out.println(mid_arr[0]+" "+mid_arr[1]);
    }
}
