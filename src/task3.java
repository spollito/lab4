public class task3 {
    public static void main(String[] args) {

        int result = fib(10);
        System.out.println("The Fibonacci number is: " + result);
    }

    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
//The time complexity of this Fibonacci algorithm is because each call to fib(n) results in two additional calls, branching out like a binary tree.//
