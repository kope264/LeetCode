import java.util.Arrays;

public class MajorityElement {
    public static int majority(int nums[]){
        Arrays.sort(nums);
        return nums[nums.length/2]; //its simple logic if a numbers apperar more than n/2 times then it will be definitely at n/2 index in sorted array
    }
    
    
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
}
