package Company.netEase;

import java.util.ArrayList;

public class HappyNumber {
    private static int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += (n%10) * (n%10);
            n = n / 10;
        }
    return sum;
    }
    public static void main(String[] args) {
        int num = 19;
        ArrayList<Integer> ls = new ArrayList<>();
        while (true){
            if(ls.contains(sum(num)) && sum(num)!= 1){
                System.out.println(false);
                return;
            }else{
                if(sum(num) == 1){
                    System.out.println(true);
                    return;
                }
                ls.add(sum(num));
                num = sum(num);
                continue;
            }
        }
    }
}
