package Company.HuaWei;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            HashMap<Character,Integer> map = new HashMap<>();
            for(Character character : ch){
                if(map.containsKey(character)){
                    map.put(character, map.get(character)+1);
                }else{
                    map.put(character,1);
                }
            }

            int min = Integer.MAX_VALUE;
            for(Character c : map.keySet()){
                min = Math.min(min, map.get(c));
            }

            StringBuilder sb = new StringBuilder();
            for(Character c : ch){
                if(min != map.get(c)){
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }}