//Complete this code or write your own from scratch
import java.util.*;
//import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //have to put outside for accessibility
         Map<String, Integer> list = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            // name = key, phone = value      
             list.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
             if (list.get(s) == null){
              System.out.println("Not found");
          } else {
              //get(s) gets the value of key s, in this case: get phone of name s
              System.out.println(s+ "=" + list.get(s));
          }
        }
        in.close();
    }
}