import java.util.Scanner;

public class doiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập usd: ");
        double usd =sc.nextDouble();
        double vnds;
        vnds = usdtovnd(usd);
        System.out.println(vnds);
        System.out.println("nhập vnd: ");
        double vnd = sc.nextDouble();
        usd =vndtousd(vnd);
        System.out.println(usd);

    }
    public static double usdtovnd(double usd){
        return usd * 23000;
    }
    public static double vndtousd(double vnd){
        return vnd / 23000;
    }
}
