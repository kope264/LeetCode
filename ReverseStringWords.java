public class ReverseStringWords {
    // Reverse words in a given string
    // the question here is that we have to reverse the words in the string such that 
    //there are no leading and trailing spaces and only one space between the charecters


    public static String reverseWords(String s) { // reverse words
        String[] words= s.split(" +"); //here we use the split meathod of string which gives every substring until the given charecter in brackets
        StringBuilder x= new StringBuilder(); //stringbuilder is used words in reverse order
     
        for(int i=words.length-1;i>=0;i--){  //reverse loop
            x.append(words[i]+" "); //adding words
        }

        return x.toString().trim(); //coverting to string and removing leading and trailing spaces

    }
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }
    
}
