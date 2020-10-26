//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Day10 {

   
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;  
        int set = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");       
        String binaryNum = Integer.toBinaryString(n);

        for (int i = 0; i < binaryNum.length(); i++){      
            if (binaryNum.charAt(i) == '1'){
           //  if (binaryNum.charAt(i) == binaryNum.charAt(i+1)){
                    count++;
                   set = Math.max(set, count); //make set = count if set < count
                }  else {
                    count = 0; //reset count back to zero if reaches '0' in binary
                }
            }
            
        
        
        System.out.println(set);

        scanner.close();
    }
}
