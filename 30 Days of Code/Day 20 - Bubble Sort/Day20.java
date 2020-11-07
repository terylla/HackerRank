//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numSwaps = 0;
        int firstElement = 0;
        int lastElement = 0;
        int temp;
        boolean swapped;
        
        //n-1 because after the 1st round of loop, n-1 is the largest number in the array
        for (int i = 0; i < n-1; i++){
            // n - i -1, because we only want to go up to the number that is not sorted 
            for (int j = 0; j < n - i -1; j++){
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                    numSwaps++;
                }                             
            }
            firstElement = a[0]; // get first element in array (smallest number)
            lastElement = a[n-1]; // get last element in array (largest number)
       }
        
        
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}