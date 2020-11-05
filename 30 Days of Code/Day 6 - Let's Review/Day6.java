// Day 6: Let's Review


//import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();  // scan the "2" from input, number of test cases
        scan.nextLine(); // go to front of next line which is "Hacker"
        // if you don't apply an extra nextLine(), it stays at the end of int
        // and you won't be able to read "Hacker"       
        
        for (int i = 0; i < T; i++) {     

            String even = "", odd = "";
            String S = scan.nextLine(); // read "Hacker" now inside loop so it does count
            
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0)
                  //  even += s.substring(j, j + 1);
                  even += S.charAt(j);
                else
                 //   odd +=S.substring(j, j + 1);
                 odd += S.charAt(j);            
            }

            System.out.println(even + " " + odd);
       }
        
        scan.close();
    }
}
