import java.util.Scanner;

public class chuBeDan {
    public static void main(String[] args) {

        double usd =3 ;
        double vnd;
        vnd = vndToUsd(usd);
        System.out.println(vnd);
    }
    public static double vndToUsd(double usd){

        return  usd* 23000;
    }
}
