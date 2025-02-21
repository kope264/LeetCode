import java.util.Stack;

public class BaseBallGame {
     public static int calPoints(String[] operations) {
    Stack<Integer> ls= new Stack<>(); //creating a stack
        for(String op : operations){ //iterating through the operations string array
            if(op.equals("C")){ //if the operation is "C" then we have to remove the last valid score
                ls.pop(); 
            }
            else if(op.equals("D")){ //if the operation is "D" then we have to double the last valid score
                ls.push(2*ls.peek());
            }
            else if(op.equals("+")){ //if the operation is "+" then we have to add the last two valid scores
                int last=ls.pop(); //pop the last valid score and store it in last
                int seclast=ls.peek(); //peek the last valid score and store it in seclast
                ls.push(last); //push the last valid score back into the stack
                ls.push(last+seclast); //push the sum of the last two valid scores into the stack
            }
            else{
                ls.push(Integer.parseInt(op)); //if the operation is a number then we have to push the number into the stack
            }

        
        }
        int sum=0;
            while(!ls.isEmpty()){ //find the sum of the valid scores
                int x= (ls.pop()); //pop the last valid score
                sum+=x; 
            }

            return sum;
    }
    public static void main(String[] args) {
        String[] operations={"5","2","C","D","+"};
        System.out.println(calPoints(operations));
        String[] operations1={"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(operations1));
    }
}
