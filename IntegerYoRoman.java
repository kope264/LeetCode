public class IntegerYoRoman { //in this question we have to convert the given integer to roman number
    //in our approach what we did is first defined arrays of thousand hundread tens and ones


    public static String intToRoman(int num) {  //function to convert integer to roman number
        String result = ""; //initializing the result string
         String[] thousands = {"", "M", "MM", "MMM"}; //array of thousand
       String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; //array of hundred
       String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};//array of tens
       String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};//array of ones
       
       // Thousands place
       result += thousands[num / 1000]; // adding the value of thousand to the result such that num/1000 gives the value of thousand

       
       // Hundreds place
       num %= 1000;
       result += hundreds[num / 100];
       
       // Tens place
       num %= 100;
       result += tens[num / 10];
       
       // Ones place
       num %= 10;
       result += ones[num];
       
       return result;
   }
   public static void main(String[] args) {
         System.out.println(intToRoman(3));
         System.out.println(intToRoman(4));
         System.out.println(intToRoman(9));
         System.out.println(intToRoman(58));
         System.out.println(intToRoman(1987));

         //lets take example of num=1987

//These arrays store precomputed Roman numeral values for different place values.

// Step 2: Get the Thousands Place (1987 / 1000 = 1)

// result += thousands[1]; // "M"
// ✔ Current result = "M"
// 1987 % 1000 = 987(current value of num)




// Step 3: Get the Hundreds Place (1987 % 1000 = 987, then 987 / 100 = 9)

// result += hundreds[9]; // "CM"
// ✔ Current result = "MCM"
// 987 % 100 = 87(current value of num)





// Step 4: Get the Tens Place (987 % 100 = 87, then 87 / 10 = 8)

// result += tens[8]; // "LXXX"
// ✔ Current result = "MCMLXXX"
// 87 % 10 = 7(current value of num)






// Step 5: Get the Ones Place (87 % 10 = 7, then 7 / 1 = 7)

// result += ones[7]; // "VII"
// ✔ Final result = "MCMLXXXVII"
// 7 % 1 = 0(current value of num)





// Final Output

// 1987 → "MCMLXXXVII"


   }
    
}
