public class MoveZero{
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
       

        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(java.util.Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0,0,3,4,5,6,7,0,7,1,0,0,8};
        moveZeroes(nums2);
        System.out.println(java.util.Arrays.toString(nums2)); // Output: [0]
    }
}
