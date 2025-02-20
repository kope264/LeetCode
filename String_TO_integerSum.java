public class String_TO_integerSum { 

    // in this problem we are given a string and an integer k
    // we have to convert the string into a string of integers
    // where a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8, i=9, j=10, k=11, l=12, m=13, n=14, o=15, p=16, q=17, r=18, s=19, t=20, u=21, v=22, w=23, x=24, y=25, z=26
    // and then we have to find the sum of the digits of the string
    // and then we have to repeat the process k times
    public static int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){ //converting the string into a string of integers
            str.append(c-'a'+1); //ascii value of a is 97 so we subtract 97 from the ascii value of the character and then add 1 to it
                                 //for example if the character is 'a' then ascii value of 'a' is 97 so 97-97=0+1=1
                                 //if the character is 'b' then ascii value of 'b' is 98 so 98-97=1+1=2
                                 // and so on...   

        }
        int sum=sumof(str.toString()); //covert the stringbuilder to string and then find the sum of the digits
        while(k>1){ //repeat the process k times
            sum=sumof(Integer.toString(sum)); //covert the sum into string and then find the sum of the digits
            k--;
        }

        return sum; //and then return the sum
       
    }
    private static int sumof(String s){
            int sum=0;
            for(int i=0;i<s.length();i++){
                    sum+=s.charAt(i)-'0';//here we take character at index i and subtract the ascii value of '0' from it
                                        //for example if the character is '1' then ascii value of '1' is 49 so 49-48=1
                                        //if the character is '2' then ascii value of '2' is 50 so 50-48=2
                                        //and so on...
            }
            return sum;
    }
    public static void main(String[] args) {
        String s="iiii";
        int k=1;
        System.out.println(getLucky(s,k));
        String s1="leetcode";
        int k1=2;
        System.out.println(getLucky(s1,k1));
        String s2="zbax";
        int k2=2;
        System.out.println(getLucky(s2,k2));
    }
    
}
