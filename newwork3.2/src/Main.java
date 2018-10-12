import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int x = scn.nextInt();
        if (x%2==0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
}