import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int month = scn.nextInt();
        int date =scn.nextInt();
        if (month>12||month<1||date>31||date<1){
            System.out.println("資料輸入錯誤(month1~12 date1~31)");
        }else if (month ==1){
            if (date<=20){
                System.out.println("Capricorn");
            }else if (date>20){
                System.out.println("Aquarius");
            }
        }else if (month ==2){
            if (date<=18){
                System.out.println("Aquarius");
            }else if (date>18){
                System.out.println("Pisces");
            }
        }else if (month ==3){
            if (date<=20){
                System.out.println("Pisces");
            }else if (date>20){
                System.out.println("Aries");
            }
        }else if (month ==4){
            if (date<=20){
                System.out.println("Aries");
            }else if (date>20){
                System.out.println("Taurus");
            }
        }else if (month ==5){
            if (date<=20){
                System.out.println("Taurus");
            }else if (date>20){
                System.out.println("Gemini");
            }
        }else if (month ==6){
            if (date<=20){
                System.out.println("Gemini");
            }else if (date>20){
                System.out.println("Canaer");
            }
        }else if (month ==7){
            if (date<=20){
                System.out.println("Canaer");
            }else if (date>20){
                System.out.println("Leo");
            }
        }else if (month ==8){
            if (date<=20){
                System.out.println("Leo");
            }else if (date>20){
                System.out.println("Virgo");
            }
        }else if (month ==9){
            if (date<=20){
                System.out.println("Virgo");
            }else if (date>20){
                System.out.println("Libra");
            }
        }else if (month ==10){
            if (date<=20){
                System.out.println("Libra");
            }else if (date>20){
                System.out.println("Scorpio");
            }
        }else if (month ==11){
            if (date<=20){
                System.out.println("Scorpio");
            }else if (date>20){
                System.out.println("Sagittarius");
            }
        }else if (month ==12){
            if (date<=20){
                System.out.println("Sagittarius");
            }else if (date>20){
                System.out.println("Capricorn");
            }
        }
    }
}
