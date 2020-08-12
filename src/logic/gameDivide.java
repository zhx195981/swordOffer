package logic;

import java.util.Scanner;
import java.util.Stack;

class obj {
    int time;
    int id;
}
public class gameDivide{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<obj> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        int max = 0;
        int smallId = 0;
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            while(n-- > 0){
                int timeEve = sc.nextInt();
                int idEve = sc.nextInt();
                int flag = sc.nextInt();
                if(flag == 0){
                    obj o = new obj();
                    o.time = timeEve;
                    o.id = idEve;
                    s1.push(o);
                    s2.push(0);
                }else{
                    obj o = s1.pop();
                    int minors = s2.pop();
                    int time = timeEve - o.time - minors;
                    if(!s2.empty())
                        s2.push(time +  s2.pop());
                    if(max < time){
                        max = time;
                        smallId = o.id;
                    }

                }

            }
            System.out.println(smallId);
        }

    }
}

