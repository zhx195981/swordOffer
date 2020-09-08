package Company.HuaWei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有相同长度大于2的子串重复
 */
public class Main09 {
    public static boolean judgeRepeat(String s){
        char[] ch = s.toCharArray();
        ArrayList<Character> ch1 = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            char character = ch[i];
            if (ch1.contains(character)) {
                int index = ch1.indexOf(character);
                if (ch1.size() > index + 2 && ch.length > i + 2) {
                    if (ch1.get(index + 1) == ch[i + 1]) {
                        if (ch1.get(index + 2) == ch[i + 2]) {
                            return false;
                        }

                    }
                }

            }
            ch1.add(character);
        }
        return true;
    }
    public static boolean judgeContains(String s){
        ArrayList<Integer> ls = new ArrayList<>();
        char[] ch = s.toCharArray();
        for(Character character : ch){
            int flag;
            if(character <= 'Z' && character >= 'A'){
                flag = 1;
            } else if(character <= 'z' && character >= 'a'){
                flag = 2;
            } else if(character <= '9' && character >= '0'){
                flag = 3;
            }else{
                flag = 4;
            }

            if(!ls.contains(flag)){
                ls.add(flag);
            }
        }

        if(ls.size() >= 3)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.length() > 8 && judgeRepeat(s) && judgeContains(s)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }

    }
}
