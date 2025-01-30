public class SubString {
    public static boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t
        
        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) { // If characters match
                i++; // Move pointer in s
            }
            j++; // Always move pointer in t
        }
        
        // If all characters of s are matched, it's a subsequence
        return i == s.length(); // Return true if all characters of s are matched
    }
    
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        
        // Check if s is a subsequence of t
        System.out.println(isSubsequence(s, t)); // Output: true
    }
}
