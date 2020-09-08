package Company.OppO;

import java.util.*;

public class Main01{

    public static void help(String s){
        int l = s.length();
        String[] res = new String[l/8 + 1];

        if(l <= 8){
            res[0] = s;
            for(int i = 0; i < 8-l; i++)
                res[0] = res[0] + "0";
        }

        int n = 1;
        if(l > 8){
            for(int j = 0; j < l/8; j++){
                res[j] = s.substring(8*n-8, 8*n);
                n++;
            }
            if(8*n-8 < l) {
                res[l / 8] = s.substring(8 * n - 8, l);
                for (int i = 0; i < 8 * n - l; i++)
                    res[l / 8] = res[l / 8] + "0";
            }
        }
        for(String m: res){
            if(m != null)
            System.out.println(m);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        help(s1);
        help(s2);


    }
}