public class jumpMax {
    public static boolean canJump(int[] nums) { // Function to check if we can reach the last index 
        
        int maxReach = 0; // Initialize a variable maxReach to store the maximum reachable index
      // the value of maxReach is the maximum index that can be reached from the current index

       for (int i = 0; i < nums.length; i++)  { // Loop through the array
           if (i > maxReach) {  // If current index is beyond max reachable index  

            // like for example if current index is 4 and maxReach is 3, then we can't reach the last index thus it will return false
               return false; // If current index is beyond max reachable index
           }
        
           maxReach = Math.max(maxReach, i + nums[i]); // Update the maxReach to the maximum of the current maxReach and the index that can be reached from the current index
           if (maxReach >= nums.length - 1) { // If we can reach or surpass the last index
            //like if value of max reach is 5 and length of nums is 5, then we can reach the last index thus it returns true
               return true; // If we can reach or surpass the last index
           }
       }
       return true; //this return statement is useless as it will never be reached fuck this shit!!!!!
   }

   public static void main(String[] args) {
         int[] nums = {2, 3, 1, 1, 4};
         System.out.println(canJump(nums));  // Output: true
         int [] nums1 = {3, 2, 1, 0, 4};
         System.out.println(canJump(nums1));  // Output: false
            int [] nums2 = {2, 0, 0};
            System.out.println(canJump(nums2));  // Output: true    
   }
    
}
