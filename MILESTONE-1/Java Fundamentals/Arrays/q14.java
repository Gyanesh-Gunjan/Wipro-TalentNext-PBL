/*
Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222

*/

public class q14{
    public static void main(String args[]){
        if(args.length == 9){
            int arr[][] = new int[3][3];
            int indx = 0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j] = Integer.parseInt(args[indx++]);
                }
            }
            int max_ele = arr[0][0];
            System.out.println("The given array is : ");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" ");
                    if(arr[i][j] > max_ele)
                        max_ele = arr[i][j];
                }
                System.out.println();
            }           

            System.out.println("The biggest number in the array is "+max_ele);

        }
        else{
            System.out.println("Please enter 9 integer numbers");

        }
    }
}