public class TwoSumII {
    public  static int[] twoSum(int[] numbers, int target) { // Function to find the two numbers that add up to the target

        int i = 0, j = numbers.length - 1; // Initialize two pointers, one at the start and one at the end of the array
         
         while (i < j) { // Loop until the two pointers meet
             int sum = numbers[i] + numbers[j]; // Calculate the sum of the two numbers at the two pointers
             if (sum == target) { // If the sum is equal to the target, return the indices of the two numbers
                 return new int[]{i + 1, j + 1}; 
             } else if (sum < target) { // If the sum is less than the target, increment the first pointer
                 i++;
             } else { // If the sum is greater than the target, decrement the second pointer
                 j--;
             }
         }
         
         return new int[]{}; // No solution found (though the problem guarantees one)
     }
    
     

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        // Example:
// numbers = [2, 7, 11, 15], target = 9
// Iteration 1: i = 0, j = 3, sum = 2 + 15 = 17 (sum > target, decrement j)
// Iteration 2: i = 0, j = 2, sum = 2 + 11 = 13 (sum > target, decrement j)
// Iteration 3: i = 0, j = 1, sum = 2 + 7 = 9 (sum == target, return [1, 2])
        int[] result = twoSum(numbers, target);
        System.out.println(java.util.Arrays.toString(result)); // Output: [1, 2]
    }
}
