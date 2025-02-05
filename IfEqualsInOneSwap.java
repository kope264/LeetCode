public class IfEqualsInOneSwap {
    public static boolean areAlmostEqual(String s1, String s2) {

        // my logic not ok for all test cases

        //     int n = s1.length();
        //     // int first = -1, second = -1;
        //     int diff = 0;
    
        //     // Find positions where s1 and s2 differ
        //     for (int i = 0; i < n; i++) {
        //         if (s1.charAt(i) != s2.charAt(i)) {
        //             diff++;
        //         }
        //     }
        //     if(diff>2){
        //         return false;
        //     }
        //     else{
        //         return true;
        //     }
        // }

        // chatgpt's help 

        if (s1.equals(s2)) {
            return true; // Already equal, no swap needed
        }

        int n = s1.length(); // Length of the strings
        int first = -1, second = -1; // Initialize the first and second mismatch indices for swapping
        int diffCount = 0; // Count of mismatches

        // Find positions where s1 and s2 differ
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) { // If the characters are different
                diffCount++; // Increment the mismatch count
                if (diffCount == 1) { // If it is the first mismatch
                    first = i; // Store first mismatch index
                } else if (diffCount == 2) { // If it is the second mismatch
                    second = i; // Store second mismatch index
                } else {
                    return false; // More than 2 mismatches, impossible with one swap
                }
            }
        }

        // Exactly 2 mismatches, check if swapping fixes the issue
        return diffCount == 2 &&   // Exactly 2 mismatches and 
               s1.charAt(first) == s2.charAt(second) && // Characters at the mismatch indices are equal after swapping
               s1.charAt(second) == s2.charAt(first); // Characters at the mismatch indices are equal after swapping
    }

    
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2)); // Output: true
    }

}
