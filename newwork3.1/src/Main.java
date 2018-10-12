import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        if (str==str.toUpperCase()){
            System.out.println(str.toLowerCase());
        }else {
            System.out.println(str.toUpperCase());
        }
    }
}
