import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int money =scn.nextInt();

        if (money>=701){
            float x1=(money-700)*5.63f;
            float x2=(money-700)*4.50f;
            money =700;
            float y1=(money-500)*4.97f;
            float y2=(money-500)*4.01f;
            money =500;
            float z1=(money-330)*4.39f;
            float z2=(money-330)*3.61f;
            money =330;
            float h1=(money-120)*3.02f;
            float h2=(money-120)*2.68f;
            money =120;
            float v1=money*2.10f;
            System.out.println(x1+y1+z1+h1+v1);
            System.out.println(x2+y2+z2+h2+v1);
        }else if (money>=501){
            float y1=(money-500)*4.97f;
            float y2=(money-500)*4.01f;
            money =500;
            float z1=(money-330)*4.39f;
            float z2=(money-330)*3.61f;
            money =330;
            float h1=(money-120)*3.02f;
            float h2=(money-120)*2.68f;
            money =120;
            float v1=money*2.10f;
            System.out.println(y1+z1+h1+v1);
            System.out.println(y2+z2+h2+v1);
        }else if (money>=331){
            float z1=(money-330)*4.39f;
            float z2=(money-330)*3.61f;
            money =330;
            float h1=(money-120)*3.02f;
            float h2=(money-120)*2.68f;
            money =120;
            float v1=money*2.10f;
            System.out.println(h1+v1);
            System.out.println(h2+v1);
        }else if (money>=121){
            float h1=(money-120)*3.02f;
            float h2=(money-120)*2.68f;
            money =120;
            float v1=money*2.10f;
            System.out.println(h1+v1);
            System.out.println(h2+v1);
        }else {
            money =120;
            float v1=money*2.10f;
            System.out.println(v1);
            System.out.println(v1);
        }
    }
}
