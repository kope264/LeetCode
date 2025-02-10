import java.util.Stack;

public class ClearLeftMost {


     public static String clearDigits(String s) {
                Stack<Character> stack = new Stack<>(); // Create a stack to store characters
 
        for (char ch : s.toCharArray()) { // For each character in the string
            if (Character.isDigit(ch)) { // If the character is a digit

                
                if (!stack.isEmpty()) {  // If the stack is not empty
                    stack.pop(); // Remove the leftmost non-digit character
                }
            } else { // If the character is not a digit
                stack.push(ch); // Push the character onto the stack
            }
        }

        StringBuilder result = new StringBuilder(); // Create a string builder to store the result
        for (char ch : stack) { // For each character in the stack
            result.append(ch); // Append the character to the result
        } 
        return result.toString(); // Return the result as a string

    }

    public static void main(String[] args) {
        String s = "abc2d43a";
        System.out.println(clearDigits(s));  // Output: aa

        
    }
    
}
