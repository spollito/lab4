public class task2 {
    public static void main(String[] args){

        int result = gcd(30,14);
        System.out.println("The GCD is: " + result);
    }


    public static int gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        return x;
    }
}

// The original output of the code tries to find the gcd using the % operand, the code above shows how the modified code to find the gcd, using subtraction. //


