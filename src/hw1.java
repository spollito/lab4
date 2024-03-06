public class hw1 {
    public static void main(String[] args) {
        printHelloWorld(5);
    }

    public static void printHelloWorld(int n) {
        if (n > 0) {
            System.out.println("Hello World");
            printHelloWorld(n - 1);
        }
    }
}

