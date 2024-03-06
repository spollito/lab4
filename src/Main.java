import java.util.*;




//TASK 1//
public class Main {
    public static void main(String[] args) {

        countDown(10);
    }


    public static void countDown(int num) {
        if (num == 0) {
            System.out.println("Blastoff!");
        }
        else {
            if (num % 2 == 0) {
            System.out.println(num);}
            countDown(num - 1);
        }
    }
    //The original output of the code is a Blastoff countdown//
    //The time complexity of this countdown algorithm is O(n) because it makes a single recursive call for each decrement from the starting number down to 0
}
