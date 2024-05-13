public class test {
    public static void main(String[] args) {
        displaySum();
    }
    public static int tong(){
        int sum = 0;
        for (int i=0;i<11;i++){
            sum += i;
        }
        return sum;
    }
    public static void displaySum(){
        System.out.println(tong());
    }

}
