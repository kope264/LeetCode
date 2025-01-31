//Product of Array Except Self with brute force approach

public class ProductExeptSelf {
    public static int[] productExceptSelf(int[] nums) { // Time complexity: O(n^2)
        int[] ans=new int[nums.length]; // Create an array to store the result
        for(int i=0;i<nums.length;i++){ // traverse the array
          int product=1;  //initialize product as 1
              for(int j=0;j<nums.length;j++){ // traverse the array
             
                    if(i!=j){ // if i is not equal to j
                         product*= nums[j]; // multiply the product with the element of the array
                     }
                     ans[i]=product; // store the product in the array
        }
        }
       
 
        return ans;
    }


//Product of Array Except Self with optimal approach
    public static int[] productExceptSelf_Optimal(int[] nums) { // Time complexity: O(n)
       
            int n = nums.length; // Get the length of the array
         int[] ans = new int[n]; // Create an array to store the result
         
         // Step 1: Compute Prefix Products
         int prefix = 1;// Initialize prefix as 1
         for (int i = 0; i < n; i++) {// Traverse the array
             ans[i] = prefix; // Store the prefix in the answer array
             prefix *= nums[i]; // Multiply the prefix with the element of the array
        
         }
             int suffix = 1;// Initialize suffix as 1
         for (int i = n - 1; i >= 0; i--) { // Traverse the array in reverse
             ans[i] *= suffix; // Multiply the suffix with the element of the answer array
             suffix *= nums[i];// Multiply the suffix with the element of the given array 
         }
         
         return ans;
     
     
     
         }
    
        public static void main(String[] args) {
            int[] nums = {-1,1,0,-3,3};
            int[] ans = productExceptSelf(nums);
            
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            } System.out.println("\n");
    
            int[] nums1 = {-1,1,0,-3,3};
            int[] ans1 = productExceptSelf_Optimal(nums1);
            for (int i = 0; i < ans1.length; i++) {
                System.out.print(ans1[i] + " ");
            }
    }
    
}
