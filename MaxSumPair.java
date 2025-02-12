public class MaxSumPair {

    //the question is such that we have to find the maximum sum of two numbers whose sum of digits are equal
       public static int maximumSum(int[] nums) { // Function to find the maximum sum of two numbers whose sum of digits are equal
        int maxi=-1; // Initialize a variable maxi to store the maximum sum

        for(int i=0;i<nums.length-1;i++){ // Loop through the array
            for(int j=i+1;j<nums.length;j++){ // Loop through the array
                if(equalSum(nums[i],nums[j])){ // If the sum of digits of the two numbers are equal
                    int sui = nums[i]+nums[j]; // Calculate the sum of the two numbers
                    maxi=Math.max(maxi,sui); // Update the maximum sum if the current sum is greater
                }
            }
        }
       return maxi; // Return the maximum sum
    }
    private static boolean equalSum(int a, int b){ // Function to check if the sum of digits of two numbers are equal
        int sum=0;  // Initialize a variable sum to store the sum of digits 1
        int cum=0; // Initialize a variable cum to store the sum of digits 2
        
        
    
        while (a > 0) { // calculate the sum of digits of a
            sum += a % 10; // Extract the last digit and add to sum
            a /= 10;       // Remove the last digit
        }
        while (b > 0) { // calculate the sum of digits of b
            cum += b % 10; // Extract the last digit and add to sum
            b /= 10;       // Remove the last digit
        }

        return sum==cum; // Return true if the sum of digits of a and b are equal

    }

        public static void main(String[] args) {
        int[] nums = {51, 32, 43, 24, 15};
        System.out.println(maximumSum(nums));  // Output: 75
        int [] nums1 = {10,12,19,14};
        System.out.println(maximumSum(nums1));  // Output: -1

             
        }
}
