package logic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串/数字,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 */
public class Permutation {
    public static ArrayList<String> help(int num){
        if(num < 0) num = Math.abs(num);
        String s = String.valueOf(num);
        ArrayList<String> result = new ArrayList<>();
        if(s == null || s.length() == 0)
            return result;
        fun(s.toCharArray(),result,0);
        Collections.sort(result);
        return result;

    }
    public static void fun(char[] ch, ArrayList<String> result, int i){
        if(i == ch.length - 1){
            String s = String.valueOf(ch);
            if(!result.contains(s)){
                result.add(s);
                return;
            }
        }else{
            for (int j = i; j < ch.length; j++) {
                swap(ch,i,j);
                fun(ch,result,i+1);
                swap(ch,i,j);
            }
        }

    }

    public static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        ArrayList<String> ls = help(123);
        for(String a : ls){
            System.out.println(a);
        }
    }
}
