public class IsSubstring {
    public static boolean isSubsequence(String s, String t) { // Function to check if s is a subsequence of t
        int i=0, j=0;  // Initialize two pointers i and j to 0
        while(i<s.length()&&j<t.length()){ // Traverse the strings such that i is less than the length of s and j is less than the length of t
          if(s.charAt(i)==t.charAt(j)){ // If the characters at the two pointers are equal
              i++; // Increment the first pointer only if the characters are equal
          }
          j++; // Increment the second pointer
        }
  
        return i==s.length(); // If the first pointer is equal to the length of s, return true
  
      }

      public static void main(String[] args) {
        String s= "abc";
        String t= "ahbgdc";
        System.out.println(isSubsequence(s,t));
        String s1= "axc";
        String t1= "ahbgdc";
        System.out.println(isSubsequence(s1,t1));
      }
    
}
