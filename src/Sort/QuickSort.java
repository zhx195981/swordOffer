package Sort;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end){
        if(start >= end)
            return;
        int index = help(array,start,end);

        quickSort(array,start,index-1);
        quickSort(array,index+1,end);

    }
    private static int help(int[] array, int start, int end){

        int key = array[end];
        int i = 0;
        for (int j = 0; j < end; j++) {
            if(array[j] < key){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }

        }

        array[end] = array[i];
        array[i] = key;
        return i;

    }

    public static void main(String[] args) {
        int[] num = {1,8,9,4,2,5,7,6,0,3};
        QuickSort.quickSort(num,0,num.length-1);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }

    }
}
