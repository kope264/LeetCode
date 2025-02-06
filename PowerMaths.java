public class PowerMaths{
    public static double myPow(double x, int n) {
        double prod=1;
        

        //for completing test cases 
        // if (n==-2147483648&&x==2){
        //     return 0;

        // }
        // if(n==-2147483648&&x==1){
        //     return 1;
        // }

        
         if (n == 0) {  // Base case: x^0 = 1
            return 1;
        }

        // Handle negative powers by flipping the sign of n and taking the reciprocal of x
        if (n < 0) {
            x = 1 / x;
            n = -n;  // Convert n to positive for easier recursion
        }
      while (n > 0) { // While the exponent is positive
        // If n is odd, multiply the result by x
        if (n % 2 == 1) { // If n is odd
            prod *= x; // Multiply the result by x
        }

        // Square the base and halve the exponent
        x *= x; // Square the base
        n /= 2; // Halve the exponent
    }
    return prod; // Return the result
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n)); // Output: 1024.00000
        double x1 = 2.10000;
        int n1 = 3;
        System.out.println(myPow(x1, n1)); // Output: 9.26100
    }
}
