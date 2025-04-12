

public class RotateArray {

    public static void rotate(int[] nums, int k) { // Function to rotate the array
        int n = nums.length;        // Get the length of the array
        // If k is greater than the length of the array, take the modulo of k with n to get the effective rotation (remainder)
         k = k % n; //
         reverse(nums, 0,nums.length-1);  // Reverse the entire array, here 1,2,3,4,5 becomes 5,4,3,2,1
         reverse(nums, 0,k-1);  // Reverse the array from 0 to k-1, in eg. k=2 thrn from index 0 to 1 it swaps 5,4 to 4,5 which makes the array 4,5,3,2,1
         reverse(nums,k,nums.length-1);// Reverse the array from k to n-1, now we reverse the remaining array from index 2 to 4 it reverses 3,2,1 to 1,2,3 which makes the array 4,5,1,2,3
        
         }
     
     private static void reverse(int[] nums,  int start, int end){ // Function to reverse the array parameters here are array and start and end index
         while(start<end){  // Loop until start is less than end
         int temp = nums[start]; // Swap the elements at start and end
             nums[start] = nums[end];
             nums[end] = temp;
             start++; // Increment start and decrement end after evry swap
             end--;
         }
         }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        rotate(nums, k);

        
        System.out.println(java.util.Arrays.toString(nums)); // Output: [4, 5, 1, 2, 3]
    }
}
