public class MaxSumSubArray {
    public static int maxAscendingSum(int[] nums) {
        int curr_sum=nums[0],max=nums[0]; // Initialize the current sum and the maximum sum to the first element of the array

        
        for(int i=1;i<nums.length;i++){ // Iterate through the array starting from the second element
            if(nums[i]>nums[i-1]){ // If the current element is greater than the previous element, add it to the current sum
                curr_sum += nums[i]; 
            }
            else{ // If the current element is not greater than the previous element, update the maximum sum and reset the current sum
                max=Math.max(max,curr_sum); // Update the maximum sum
                curr_sum=nums[i]; // Reset the current sum to the current element
            }
        }
        max=Math.max(max,curr_sum); // Update the maximum sum after the loop ends
        return max;
        }
        public static void main(String[] args) {
            int[] nums = {10,20,30,5,10,50};
            System.out.println(maxAscendingSum(nums)); // Output: 65
        }
}
