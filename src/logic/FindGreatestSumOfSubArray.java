package logic;

public class FindGreatestSumOfSubArray {
    public static int findGreatestSumOfSubArray(int[] arr){
        if(arr == null || arr.length == 0)
            return 0;

        int sum = Integer.MIN_VALUE;
        int tmpSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(tmpSum <= 0)
                tmpSum = arr[i];
            else
                tmpSum += arr[i];

            sum = (sum > tmpSum)? sum :tmpSum;


        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-1,0,2,3};
        int a = findGreatestSumOfSubArray(arr);
        System.out.println(a);
    }
}
