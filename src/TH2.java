public class TH2 {
    public static void main(String[] args) {
        int []array = {2,4,6,8,1,3};
        int small = minValue(array);
        System.out.println("giá trị nhỏ nhất trong mảng là: " + array[small]);
    }

    public static int minValue(int[] array) {
    int small = 0;
    for (int i =1 ;i< array.length;i++){
        if (array[i] < array[small]){
            small = i;
        }
    }
        return small;
    }
}
