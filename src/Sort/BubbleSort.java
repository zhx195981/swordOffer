package Sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    public static void main(String[] args) {
        int[] num = {1,8,9,4,2,5,7,6,0,3};
        bubbleSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}
