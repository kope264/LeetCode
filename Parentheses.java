import java.util.*;

// simply used two variables open and closed to keep track of the number of '(' and ')' paranthesis
// and then used a recursive function to generate the paranthesis
//if open<total then we can add '(' to the string
//if closed<open then we can add ')' to the string
//if the length of the string is equal to 2*total then we add the string to the list
//this way we can generate all the possible combinations of paranthesis


public class Parentheses {
 


    public static List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
        solve( "", 0, 0, n,result);
        return result;

        
    }
    private static void solve(String curr, int open, int closed, int total, List<String> ls){
        if(curr.length()==2*total){
            ls.add(curr);
            return;
        }
        if(open<total){   //if open<total then we can add '(' to the string

            solve( curr+"(",  open+1,  closed, total,  ls);
        }
        if(closed<open){   //if closed<open then we can add ')' to the string
            solve( curr+")",  open,  closed+1, total,  ls);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of paranthesis :");
        int n=sc.nextInt();
        List<String> ls= generateParenthesis(n);
        // Your code here
        System.out.println(ls);
        sc.close();
    }
    
}
    

