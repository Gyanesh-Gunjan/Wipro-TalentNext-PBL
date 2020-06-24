/*
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
*/


public class q13{
    public static void main(String args[]){
        if(args.length == 4){
            int arr[][] = new int[2][2];
            int indx = 0;
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++)
                    arr[i][j] = Integer.parseInt(args[indx++]);
            }
            System.out.println("The given array is : ");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }            
            int temp;
            temp = arr[0][0];
            arr[0][0] = arr[1][1];
            arr[1][1] = temp;

            temp = arr[0][1];
            arr[0][1] = arr[1][0];
            arr[1][0] = temp;

            System.out.println("The reverse of the array is :");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }

        else{
            System.out.println("Please enter 4 integer numbers");
        }
        
    }
}
