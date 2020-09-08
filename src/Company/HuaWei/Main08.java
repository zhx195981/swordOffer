package Company.HuaWei;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/practice/f9c6f980eeec43ef85be20755ddbeaf4?tpId=37&tags=&title=&diffculty=0&judgeStatus=0&rp=1
 * 购物单
 */
public class Main08 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int valueTotal = sc.nextInt();
            int num = sc.nextInt();
            goods[] gs = new goods[num + 1];
            for (int i = 1; i <= num; i++) {
                int v = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt();
                gs[i] = new goods(v, p, q);
                if (q > 0) {
                    if (gs[q].a1 == 0) {
                        gs[q].setA1(i);
                    } else {
                        gs[q].setA2(i);
                    }
                }
            }

            int[][] dp = new int[num + 1][valueTotal + 1];
            for (int i = 1; i <= num; i++) {
                int v, v1 = 0, v2 = 0, v3 = 0, tempdp, tempdp1 = 0, tempdp2 = 0, tempdp3 = 0;
                tempdp = gs[i].v * gs[i].p;
                v = gs[i].v;

                if (gs[i].a1 != 0) {
                    tempdp1 = gs[i].v * gs[i].p + gs[gs[i].a1].p * gs[gs[i].a1].v;
                    v1 = gs[i].v + gs[gs[i].a1].v;
                }
                if (gs[i].a2 != 0) {
                    tempdp2 = gs[i].v * gs[i].p + gs[gs[i].a2].p * gs[gs[i].a2].v;
                    v2 = gs[i].v + gs[gs[i].a2].v;
                }

                if (gs[i].a1 != 0 && gs[i].a2 != 0) {
                    tempdp3 = gs[i].v * gs[i].p + gs[gs[i].a2].p * gs[gs[i].a2].v + gs[gs[i].a1].p * gs[gs[i].a1].v;
                    v3 = gs[i].v + gs[gs[i].a1].v + gs[gs[i].a2].v;
                }

                for (int j = 1; j <= valueTotal; j++) {
                    if (gs[i].q != 0 || v > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i-1][j];
                        if (j >= v && v != 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v] + tempdp);
                        if (j >= v1 && v1 != 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v1] + tempdp1);
                        if (j >= v2 && v2 != 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v2] + tempdp2);
                        if (j >= v3 && v3 != 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v3] + tempdp3);
                    }

                }
            }

            System.out.println(dp[num][valueTotal]);
        }
    }
    class goods {
        int v;
        int p;
        int q;
        int a1 = 0;
        int a2 = 0;

        goods(int v, int p, int q) {
            this.v = v;
            this.p = p;
            this.q = q;
        }

        public void setA1(int a1) {
            this.a1 = a1;
        }

        public void setA2(int a2) {
            this.a2 = a2;
        }
    }

