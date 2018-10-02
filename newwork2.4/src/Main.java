import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if (x % 4 != 0) {
            System.out.println("Common Year");
        } else if (x % 100 == 0 && x % 400 != 0) {
            System.out.println("Common Year");
        } else {
            System.out.println("Bissextile Year");
        }
    }
}