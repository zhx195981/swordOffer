package logic;

/**
 * 实现除法
 */
public class divide {
    public int divide1(int dividend, int divisor) {
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
}
