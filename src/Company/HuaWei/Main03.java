package Company.HuaWei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        while(n-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(map.containsKey(a)){
                int c = map.get(a);
                map.put(a,c+b);
            }else{
                map.put(a,b);
            }
        }
        ArrayList<Integer> ls = new ArrayList();
        for(int i :  map.keySet()){
            ls.add(i);
        }
        Collections.sort(ls);
        for(int i : ls){
            System.out.println(i + " " + map.get(i));
        }
    }}