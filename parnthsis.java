import java.util.*;

public class parnthsis {
 


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
        if(open<total){

            solve( curr+"(",  open+1,  closed, total,  ls);
        }
        if(closed<open){

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
    

