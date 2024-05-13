import java.util.Scanner;

public class hienThiLoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        String name = sc.nextLine();
        inputname(name);
    }
    public static void inputname(String hi){
        System.out.println("xin chao " + hi);

    }
}
