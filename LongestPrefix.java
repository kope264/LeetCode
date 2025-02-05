import java.util.Arrays;

public class LongestPrefix {
     public static String longestCommonPrefix(String[] strs) { // Function to find the longest common prefix
          if (strs == null || strs.length == 0) { // If the input array is null or empty
            return ""; // Return an empty string
        } 
        
       
        Arrays.sort(strs); // Sort the array of strings in the lexicographical order which means the order in which the words are listed in a dictionary
         
      
        String first = strs[0];// Get the first string after sorting 
        String last = strs[strs.length - 1]; // Get the last string after sorting
      StringBuilder ans = new StringBuilder(""); // Initialize a StringBuilder to store the common prefix
      for(int i=0;i<first.length();i++){ // Iterate through the characters of the first string
        if(first.charAt(i)==last.charAt(i)){ // If the character at the same index in the first and last string are equal
            ans.append(first.charAt(i)); // Append the character to the StringBuilder
        }else{ // If the characters are not equal
            break; // Break the loop because the common prefix ends here 
        }
      }

    return ans.toString(); // Return the common prefix as a string because the StringBuilder cannot be returned as a string this it is converted to a string
}
public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"}; 
    //After sorting the array of strings, the array becomes ["flight","flow","flower"]
    
    System.out.println(longestCommonPrefix(strs)); // Output: "fl"
}
}
