package Company.netEase;

import java.util.Scanner;

class Main{

    public static boolean isTrue(String s){
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(s.charAt(i) != s.charAt(length - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s == null || s.length() ==0)
            System.out.println();
        if(isTrue(s)){
            System.out.println(s);
            return;
        }
        String result = null;
        for(int i = 1; i <= s.length(); i++){
            String sub = s.substring(0,i);
            String s1 = new StringBuilder(sub).reverse().toString();
            if(isTrue(s+s1)){
                result = s + s1;
                break;
            }

        }



        System.out.println(result);


    }

}
