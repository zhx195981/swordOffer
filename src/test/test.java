package test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class test {

    public static int rob(int[] nums) {
        int length = nums.length;
        int sumFirst = 0;
        int sumSecond = 0;
        for(int i = 0; i < length; i = i+2)
            sumFirst += nums[i];
        for(int j = 1; j < length; j = j+2)
            sumSecond += nums[j];
        return Math.max(sumFirst, sumSecond);


    }

    public static void main(String[] args) {
        //int a = divide(-2147483648,-1);
        int[] array = {2,1,1,2};
        int a =  rob(array);

        ArrayList<Integer> list = new ArrayList<>();


    }

}