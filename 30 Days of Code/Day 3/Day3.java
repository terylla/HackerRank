//Intro to Conditional Statements

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Day3 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 1){
            System.out.printf("Weird");
        } else if ((N % 2 == 0) && (2 <= N) && (N <= 5)) {
            System.out.printf("Not Weird");
        } else if ((N % 2 == 0) && (6 <= N) && (N <= 20)) {
            System.out.printf("Weird");
        } else if ((N % 2 == 0) && (N > 20)) {
            System.out.printf("Not Weird");
        }
        scanner.close();
    }
}
