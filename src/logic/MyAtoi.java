package logic;

public class MyAtoi {
    public static int myAtoi(String str) {
        str = str.trim();
        if(str == null || str.length() == 0)
            return 0;
        int flag = 1;
        int start = 0;
        if(str.charAt(0) == '-'){
            flag = -1;
            start++;
        }

        if(str.charAt(0) == '+'){
            flag = +1;
            start++;
        }

        long res = 0;
        for(int i = start; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))) {
                return (int) res * flag;
            }
            res = res * 10 + str.charAt(i) - '0';

            if (flag == 1 && res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (flag == -1 && res > Integer.MAX_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) res * flag;

    }

    public static void main(String[] args) {
        String a = "   ";
        System.out.println(a.trim() + "22");
    }
}
