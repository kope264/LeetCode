public class pivotElement { //so basically in this problem we have to find the index of the element in the array
    //such that the sum of all the elements to the left of the index is equal to the sum of all the elements to the right of the index
    //if there is no such index then we return -1
    //and if there is such index then we return the index
  


    // my solution here was to create two helper functions left and right
    //left function takes the array and the index of the element and returns the sum of all the elements to the left of the index
    //right function takes the array and the index of the element and returns the sum of all the elements to the right of the index
    //and then in pivoteIndex function we iterate through the array and for each element we find the sum of all the elements to the left of the element
    //and the sum of all the elements to the right of the element
    //and then we check if the sum of the elements to the left of the element is equal to the sum of the elements to the right of the element
    //if it is then we return the index of the element
    //if not then we return -1
    
        public static int pivotIndex(int[] nums) {
            int lefts=0;
            int rights=0;
            for(int i=0;i<=nums.length-1;i++){
                lefts=left(nums,i);
                rights=right(nums,i);
                if(lefts==rights){
                    return i;
                }
            }
            return -1;
            
        }
        private static int left(int[] nums, int x){
            int leftsum=0;
            for(int i=0;i<x;i++){
                leftsum += nums[i];
            }
            return leftsum;
        }
        private static int right(int[] nums, int x){
            int rightsum=0;
            for(int i=x+1;i<nums.length;i++){
                rightsum += nums[i];
            }
            return rightsum;
        }

    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
        int[] nums1={1,2,3};
        System.out.println(pivotIndex(nums1));
        int[] nums2={2,1,-1};
        System.out.println(pivotIndex(nums2));
    }
}
