package test;


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

    public int divide(int dividend, int divisor) {
        int num = 0;
        Boolean flag = (dividend >0 && divisor > 0) || (dividend < 0 && divisor < 0);
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);

        while(dividend <= divisor){
            int c = 1;
            int a = divisor;
            while(dividend - a <= a){
                a = a << 1;
                c = c << 1;
            }

            num = num + c;
            dividend = dividend - a;
        }
        if(flag == true)
            return num;
        else
            return num * -1;
    }

    public static void main(String[] args) {
        //int a = divide(-2147483648,-1);
        System.out.println(Math.abs(-2147483648));

    }

}