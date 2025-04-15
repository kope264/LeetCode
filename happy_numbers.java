import java.util.HashSet;
// This code defines a class named `happy_numbers` that contains a method to determine if a number is a happy number or not.
// A happy number is defined as a number which eventually reaches 1 when replaced by the sum of the square of each digit.
// If it loops endlessly in a cycle that does not include 1, then it is not a happy number.

public class happy_numbers {

    // so the approach is to use a hashset to store the sum of the squares of the digits of the number.
    // If the sum is 1, then the number is happy. 
    //If the sum is already in the hashset, then the number is not happy. because,
    // it means we have already seen this sum before.thus it will occur again resulting infinite loop
    public static boolean isHappy(int n) {
     HashSet<Integer> set= new HashSet<>();// to store the sum of the squares of the digits of the number.
     int sum =0; // to store the sum of the squares of the digits of the number.
     while(sum!=1&& !set.contains(sum)){ // loop until the sum is 1 or the sum is already in the hashset.
        set.add(sum); 
        sum=0;
        while(n!=0){ // loop until the number is 0.
            sum += Math.pow(n%10,2);// calculate the sum of the squares of the digits of the number.
            n/=10;
        }
        n=sum;// update the number to the sum of the squares of the digits of the number.
        // for example, if n=19, then the sum of the squares of the digits of the number is 1^2 + 9^2 = 82.
     }

     return sum==1; // return true if the sum is 1, false otherwise.
    }

    public static void main(String[] args) {
        int n = 19; // Example input
        boolean result = isHappy(n); // Call the function with the example input
        System.out.println(result); // Output: true (19 is a happy number)

        n = 2; // Example input
        result = isHappy(n); // Call the function with the example input
        System.out.println(result); // Output: false (2 is not a happy number)
    }

}
