import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn =new Scanner(System.in);
        int x =scn.nextInt();
        if (x>1000||x<1){
            System.out.println("輸入超過範圍(1~1000)");
        }else if (x==1000){
            System.out.println("1thousand");
        }else if (x<=999&&x>=100){
            int h =x/100;
            x =x%100;
            int t =x/10;
            x=x%10;
            System.out.println(h+"hundred"+t+"ten"+x+"dollar");
        }else if (x<=99&&x>=10) {
            int t = x / 10;
            x = x % 10;
            System.out.println(  t + "ten" + x + "dollar");
        }else if (x<=9&&x>=1) {
            System.out.println(   x + "dollar");
        }
    }
}
