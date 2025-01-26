import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>(); // List to store the result
        backtrack(candidates, target, 0, new ArrayList<>(), result);        // Call the backtrack function
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {     // Function to backtrack
        if (target < 0) { // If the target is negative
            return; // Exceeded the target, no need to proceed
        }
        if (target == 0) {// If the target is 0
            result.add(new ArrayList<>(current)); // Add the current list to the result
            return;
        }

        for (int i = start; i < candidates.length; i++) {       // Loop through the candidates
            current.add(candidates[i]); // Choose the candidate
            backtrack(candidates, target - candidates[i], i, current, result); // Recur with the new target
            current.remove(current.size() - 1); // Remove the last element
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        CombinationSum cs = new CombinationSum();
        System.out.println(cs.combinationSum(candidates, target));
        // Input: candidates = [2, 3, 6, 7], target = 7
        // Output: [[2, 2, 3], [7]]
        
    }
    
}
