import java.util.LinkedList;
import java.util.List;


// Problem: Given a array of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
// Input: ["Hello", "Alaska", "Dad", "Peace"]
// Output: ["Alaska", "Dad"]
// Explanation: Only "Alaska" and "Dad" can be typed using letters of alphabet on only one row's of American keyboard. all charecters of word "alaska" are in row 1 and all charecters of word "dad" are in row 2.

// here row1= "qwertyuiop";
// row2= "asdfghjkl";
// row3= "zxcvbnm";


// Solution:
// 1. Create a list of strings to store the words that can be typed using letters of alphabet on only one row's of American keyboard.
// 2. Create a string row1= "qwertyuiop";
// 3. Create a string row2= "asdfghjkl";
// 4. Create a string row3= "zxcvbnm";

public class Keyboard {
       public static String[] findWords(String[] words) {
        String row1= "qwertyuiop";
        String row2= "asdfghjkl";
        String row3= "zxcvbnm";
        List<String> ls= new LinkedList<>();
        for(String word : words){//for each word in words we take every word and check if all the charecters of the word are in the same row or not.
            int[] rows = new int[3]; // we create an array of size 3 representing the 3 rows.
                                    // if the charecter of the word is in row1 then rows[0]=1, if the charecter of the word is in row2 then rows[1]=1, if the charecter of the word is in row3 then rows[2]=1.
                                    // if the charecter of the word is not in any of the rows then rows[0]=0, rows[1]=0, rows[2]=0.
                                    // at the end we check if the sum of the rows is 1 then we add the word to the list.




            for(char ch: word.toLowerCase().toCharArray()){ // we convert the word to lowercase and then convert it to char array and then iterate over the charecters of the word.
                if(row1.indexOf(ch)!=-1){ //we check if the charecter is in row1 or not. if it is present then its index will be greater than -1.
                    rows[0]=1;
                }
                else if(row2.indexOf(ch)!=-1){
                    rows[1]=1;
                }
                else if(row3.indexOf(ch)!=-1){
                    rows[2]=1;
                }
            }
            int sum = rows[0]+rows[1]+rows[2]; // we calculate the sum of the rows.
            if(sum==1){

                ls.add(word); // if the sum is 1 then we add the word to the list.
            }
        
            
        }
        String arr[]= new String[ls.size()]; // we convert the list to array.
        int i=0;
        for(String x:ls){
            arr[i]=x;
            i++;
        }

        return arr; // return the array.

    }


    public static void main(String[] args) {
        String words[]={"Hello", "Alaska", "Dad", "Peace"};
        String result[]=findWords(words);
        for(String x:result){
            System.out.println(x);
        }
    }
}
