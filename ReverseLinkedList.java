import java.util.*;

public class ReverseLinkedList { 
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        // Connect the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

            // Create an object of the Solution class
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(node1); //function call to reverse the linked list

        // Print reversed list: 5 -> 4 -> 3 -> 2 -> 1
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
    }
 
}
}

 class ListNode { // Definition for singly-linked list
    int val; // Value of the node
    ListNode next; // Pointer to the next node
    
    // Constructor for ListNode
    ListNode() {} // Default constructor
    ListNode(int val) {  // Constructor with value
        this.val = val; // Set the value
    }
    ListNode(int val, ListNode next) {  // Constructor with value and next node
        this.val = val;  // Set the value
        this.next = next; // Set the next node
    }
}

class Solution {
    public ListNode reverseList(ListNode head) { // Function to reverse a linked list
     ListNode prev = null; // Initialize prev as null
        ListNode curr = head; // Initialize curr as head
        
        // Traverse the list
        while (curr != null) { // While curr is not null 
            ListNode nextTemp = curr.next;  // temporary node to store the next node
            curr.next = prev;  // the next of the current node will be the previous node
            prev = curr;  // now the previous node will be the current node
            curr = nextTemp; // now the current node will be the next node
              // this will continue until the current node is null
        }
        
        return prev;  // prev will be the new head of the reversed list
    }
}


    

