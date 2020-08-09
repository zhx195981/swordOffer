package logic;

import java.util.ArrayList;
import java.util.List;

public class restoreIpAddresses {
    public static List<String> restoreIpAddresses1(String s) {
        ArrayList<String> ls = new ArrayList<>();
        if(s == null || s.length() < 4 || s.length() > 12)
            return ls;

        for(int a = 1; a < s.length(); a++ ){
            for(int b = 1; b < s.length(); b++ ){
                for(int c = 1; c < s.length(); c++ )
                    if(c > b && b > a){
                        int a1 = Integer.valueOf(s.substring(0,a));
                        int b1 = Integer.valueOf(s.substring(a,b));
                        int c1 = Integer.valueOf(s.substring(b,c));
                        int d1 = Integer.valueOf(s.substring(c));
                        if(a1 <= 255 && b1 <= 255 && c1 <= 255 && d1 <= 255){
                            String s1 = a1 + "." + b1 + "." + c1 + "." + d1;
                            if(s1.length() == s.length() + 3)
                                ls.add(s1);
                        }



                    }

            }

        }
        return ls;
    }

    public static void main(String[] args) {
        for(String s : restoreIpAddresses1("255255255255"))
              System.out.println(s);
    }
}
