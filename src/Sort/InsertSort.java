package Sort;

public class InsertSort {

    public static void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; (j > 0) && (data[j] < data[j - 1]); j--) {
                swap(data, j, j - 1);
            }
        }
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args) {
        int[] num = {1,8,9,4,2,5,7,6,0,3};
        insertSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}

