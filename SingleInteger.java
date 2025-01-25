public class SingleInteger {
   
        public int singleNumber(int[] nums) {      //function to find the single integer in the array
              int result = 0;       //initializing the result to 0
            for (int num : nums) { 
                result ^= num;  // XOR each element with the result
            }
            return result;  
    
        }
    
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        SingleInteger si = new SingleInteger(); //creating object of the class
        System.out.println(si.singleNumber(nums1)); 
        // Input: [2, 2, 1]
        // Initial result = 0
        // XOR with 2: result = 0 ^ 2 = 2
        // XOR with 2: result = 2 ^ 2 = 0
        // XOR with 1: result = 0 ^ 1 = 1
        // Output: 1

        System.out.println(si.singleNumber(nums2)); 
        // Input: [4, 1, 2, 1, 2]
        // Initial result = 0
        // XOR with 4: result = 0 ^ 4 = 4
        // XOR with 1: result = 4 ^ 1 = 5
        // XOR with 2: result = 5 ^ 2 = 7
        // XOR with 1: result = 7 ^ 1 = 6
        // XOR with 2: result = 6 ^ 2 = 4
        // Output: 4
        
    }
}
