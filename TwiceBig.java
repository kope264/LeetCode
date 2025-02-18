public class TwiceBig {

    public static int dominantIndex(int[] nums) { // Function to find the index of the largest element in the array
                    
        
        
        // simple in this problem we have to find the index of the largest element in the array 
         //which is at least twice as large as every other number in the array




         //so what we do is find largest element and second largest element in the array
         //and then we check if the largest element is at least twice as large as the second largest element
            //if it is then we return the index of the largest element
            //if not then we return -1
        int lrg=0;
      int slrg=0;
    for (int i = 0; i < nums.length; i++) {
          if (nums[i] > lrg) { 
              slrg = lrg;  // Update second largest before updating largest
              lrg = nums[i];
          } else if (nums[i] > slrg && nums[i] != lrg) { 
              slrg = nums[i]; // Update second largest
          }
      }
      for(int i=0;i<nums.length;i++){
      if(lrg>=2*slrg&&nums[i]==lrg){
          return i;

      }
      }
   return -1;
  }
  public static void main(String[] args) {
        int[] nums={3,6,1,0};
        System.out.println(dominantIndex(nums));
        int[] nums1={1,2,3,4};
        System.out.println(dominantIndex(nums1));
  }
    
}
