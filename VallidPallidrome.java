public class VallidPallidrome {
    public static boolean isPalindrome(String s) {
        String fix=""; // Create a string to store the fixed string
        for (int i=0;i<s.length();i++){ // Traverse the given string
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))){  //if the character is a digit or a letter it will be added to the fixed string
                fix += s.charAt(i); // Add the character to the fixed string
            }
        }


        fix= fix.toLowerCase(); // Convert the fixed string to lowercase so that the comparison is case insensitive


        //*  below is code with for loop which will not work for some test cases */


        // for(int i=0;i<fix.length()/2;i++){
        //     for(int j=fix.length()-1;i>fix.length()/2;i-- ){
        //             if(fix.charAt(i)!=fix.charAt(j)){
        //                 return false;
        //             }
        //     }
        // }


         int i = 0, j = fix.length() - 1; //initializing two pointers i and j to the start and end of the fixed string

         //here we do not need to traverse the whole string as we are comparing the characters at the two pointers the loop stop in half of the string


        while (i < j) { // Traverse the string
            if (fix.charAt(i) != fix.charAt(j)) { // Compare the characters at the two pointers
                return false; // If the characters are not equal, return false
            } 
            // Increment the first pointer and decrement the second pointer
            i++;
            j--;
        }
        return true; // If the string is a palindrome, return true
    }
    
    public static void main(String[] args) {
        String s= "race car";
        System.out.println(isPalindrome(s));
        String s1= "petrol";
        System.out.println(isPalindrome(s1));
    }
}
