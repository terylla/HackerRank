import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        
        // Allocate Node & put data into newNode (data is the node to insert)
        Node newNode;        
        newNode = new Node(data);
 
       // if the linkedlist is empty, then just pass newNode to the linkedlist
        if (head == null){      
            head = newNode;        //now the LinkedList has something!
            return head;
        }          
        
        // newNode is going to be the last node since appending to the end of Linkedlist...
        //... so next of newNode is null
         newNode.next = null;
        
     
        Node last = head; // so we are not traversing the actual linkedlist
         while (last.next != null){ // while the next node of last isn't  null...
            last = last.next; // then last becomes that next node
        } 
        // ...until there is no more node after the last node
        // Change the next of Linkedlist to newNode (latest node)
        last.next = newNode;
       
        
         return head;   
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
        	////prints contents of linked list starting from the given node
            System.out.print(start.data + " "); 
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}