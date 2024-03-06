public class hw2 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 100;
        System.out.println("The sum of all numbers between " + n1 + " and " + n2 + " that are multiples of 7 is: " + sumMultiplesOfSeven(n1, n2));
    }

    public static int sumMultiplesOfSeven(int n1, int n2) {

        if (n1 > n2) {
            return 0;
        }

        else {
            if (n1 % 7 == 0) {
                return n1 + sumMultiplesOfSeven(n1 + 1, n2);
            } else {
                return sumMultiplesOfSeven(n1 + 1, n2);
            }
        }
    }
}


