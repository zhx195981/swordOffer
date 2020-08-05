package logic;

public class addStrings {
    public String addStrings1(String num1, String num2) {
        int carry = 0;
        StringBuilder sum  = new StringBuilder();
        int length_1 = num1.length();
        int length_2 = num2.length();
        int length = Math.max(length_1,length_2);
        for(int i = 1; i <= length; i++){
            int a = length_1 < i ? 0 : num1.charAt(length_1-i) - '0';
            int b = length_2 < i ? 0 : num2.charAt(length_2-i) - '0';
            sum.append((a + b + carry)% 10);
            carry = (a + b + carry)/10;
        }
        if(carry != 0)
            sum.append(carry);
        return sum.reverse().toString();

    }
}
