package logic;

public class exchange {
    private static int[] coins = {1, 3, 5}; // 硬币种类

    public static int exchange1(int m){
        int[] d = new int[m+1]; // 储存结果

        d[1] = 1;
        d[2] = 2;
        d[3] = 1;
        d[4] = 2;
        d[5] = 1;
        for (int i = 6; i <= m; i++) {
            d[i] = Math.min(d[i-5] +1, Math.min(d[i-3] +1, d[i-1] +1));
        }
        return d[m];
    }

    public static void main(String[] args) {
        int a = exchange1(100);
        System.out.println(a);



    }
}
