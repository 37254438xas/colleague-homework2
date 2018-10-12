import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn =new Scanner(System.in);
        int x =scn.nextInt();
        if (x<-1){
            int y =3*x*x;
            System.out.println(y);
        }else if (x>=-1&&x<=1){
            int y =(x*x*x)+3*x-3;
            System.out.println(y);
        }else if (x>1){
            int y =2*x+3;
            System.out.println(y);
        }
    }
}
