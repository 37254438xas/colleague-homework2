import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn =new Scanner(System.in);
        int h1 =scn.nextInt();
        int m1 =scn.nextInt();
        int h2 =scn.nextInt();
        int m2 =scn.nextInt();
        int sum = (h2-(h1+1))*60+(m2+(60-m1));


        if (sum>=240){
            int x =(sum-240)/30*60;
            sum =240;
            int y =(sum-120)/30*40;
            sum =120;
            int z =sum/30*30;
            System.out.println(x+y+z);
        }
        else if (sum>120&&sum<240){
            int y =(sum-150)/30*40;
            sum =120;
            int z =sum/30*30;
            System.out.println(y+z);
        }
        else if (sum<=120){
            int z =sum/30*30;
            System.out.println(z);
        }
        else if (sum<30){

            System.out.println("0");
        }

    }
}
