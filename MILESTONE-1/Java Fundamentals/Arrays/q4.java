/*
 Initialize an integer array with ascii values and print the corresponding character values in a single row.
*/
import java.util.*;
public class q4{
    public static void main(String args[]){
        int ascii[] = new int[128];
        for(int i=0;i<128;i++)
            ascii[i] = i;

        for(int i=0;i<128;i++)
            System.out.print((char)(ascii[i])+" ");
    }
}
