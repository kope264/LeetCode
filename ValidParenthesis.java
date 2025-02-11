public class ValidParenthesis {
    public static boolean isValid(String s) { // Function to check if the input string is valid
        int length; // Variable to store the length of the string
        do { 
            length = s.length(); // Store the length of the string after each iteration of the loop
            s = s.replace("()", "") // Remove all instances of '()' from the string
                 .replace("{}", "")      // Remove all instances of '{}' from the string
                 .replace("[]", ""); // Remove all instances of '[]' from the string
        } while (s.length() < length); // Continue until the length of the string stops decreasing
        
        return s.isEmpty();  //if the string becomes empty then return true else return false
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s)); // Output: true
        String s1 = "()[]{}";
        System.out.println(isValid(s1)); // Output: true
        String s2 = "(]";
        System.out.println(isValid(s2)); // Output: false
        String s3 = "([)]";
        System.out.println(isValid(s3)); // Output: false
        String s4 = "{[]}";
        System.out.println(isValid(s4)); // Output: true
    }
}
