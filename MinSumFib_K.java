import java.util.*;
import java.util.List;
import java.util.Scanner;

public class MinSumFib_K {

    public static int findMinFibonacciNumbers(int k) { // Function to find the minimum number of Fibonacci numbers whose sum is equal to k
     List<Integer> fibonacci = new ArrayList<>();   // Create a list to store the Fibonacci numbers
        fibonacci.add(1); // Add initial two fib numbers 1 to the list
        fibonacci.add(1);  
        int next=0; // Initialize next as 0
        while (next<k) { // While next is less than k
            next = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2); // Calculate the next Fibonacci number
            fibonacci.add(next); // Add the next Fibonacci number to the list
        }   
        int count = 0; // count of minimum numbers of Fibonacci numbers summing to k
        for (int i = fibonacci.size() - 1; i >= 0 && k > 0; i--) {  // Traverse the list from last to first on the condition that k is greater than 0
            if (fibonacci.get(i) <= k) { // If the Fibonacci number is less than or equal to k
                k -= fibonacci.get(i); // Subtract the Fibonacci number from k
                count++; // Increment the count
            } // Continue until k is greater than 0
        }
        return count;
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int k = sc.nextInt();
    findMinFibonacciNumbers(k);
    System.out.println(findMinFibonacciNumbers(k));
}
    
}
