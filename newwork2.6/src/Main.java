import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int x =scn.nextInt();
        int y =scn.nextInt();
        int z =scn.nextInt();
        if (x==y||x==z||y==z){
            System.out.println("禁止輸入相同整數");
        }else if (x>y&&x>x){
            System.out.println(x);
        }else if (y>x&&y>z){
            System.out.println(y);
        }else if (z>x&&z>y){
            System.out.println(z);
        }
        if (x==y||x==z||y==z){
            System.out.println("禁止輸入相同整數");
        }else if (x<y&&x<x){
            System.out.println(x);
        }else if (y<x&&y<z){
            System.out.println(y);
        }else if (z<x&&z<y){
            System.out.println(z);
        }
    }
}
