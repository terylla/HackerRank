//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Day11 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
         int sum1 = 0;
         int sum2 = 0;
         int sum3 = 0;
         int sum = 0;
         int maxSum = Integer.MIN_VALUE; // so if input is negative it's fine
                    
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem; // i = row, j = column
                }
            }
            
         for (int i=0; i < 4; i++){ // because each row has 3
            for (int j=0; j < 4; j++){ // each column has 3
                sum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum2 = arr[i+1][j+1];
                sum3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                sum = sum1 + sum2 + sum3;
                
                if (maxSum < sum){
                    maxSum = sum;    
                }
            }
        }
         
        scanner.close();
        System.out.println(maxSum);
    }
}
