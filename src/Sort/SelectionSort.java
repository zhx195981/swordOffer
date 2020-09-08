package Sort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);

            }

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }



    public static void main(String[] args) {
        int[] num = {1, 8, 9, 4, 2, 5, 7, 6, 0, 3};
        selectionSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}
