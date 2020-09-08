package Company.meiTuan;

import java.util.*;

class Composition extends ArrayList<Integer> {

    @Override
    public boolean equals(Object other){
        Composition comp = (Composition)other;
        Collections.sort(this);
        Collections.sort(comp);
        if(this.isEmpty() || comp.isEmpty() || this.size() != comp.size())
            return false;
        for(int i=0; i<this.size(); i++)
            if(this.get(i) != comp.get(i))
                return false;
        return true;
    }
    @Override
    public int hashCode() {
        return 0;
    }
    public static Set<Composition> calc(int n) {
        Set<Composition> devideSet = new HashSet<Composition>();
        Composition Composition = new Composition();
        switch (n) {//如果是1直接返回1
            case 1:
                Composition.add(1);
                devideSet.add(Composition);
                return devideSet;
            case 2://如果是2返回1+1
                Composition.add(1);
                Composition.add(1);
                devideSet.add(Composition);
                return devideSet;
            default:
                for (int i = 1; i <= n / 2; i++) {
                    Composition = new Composition();
                    Composition.add(i);
                    Composition.add(n - i);
                    devideSet.add(Composition);
                    if (i <= n - i) {
                        Set<Composition> partial_pos = calc(n - i);//递归调用
                        for (Composition pos : partial_pos) { //当n==2时会走这个方法
                            pos.add(i);
                            devideSet.add(pos);
                        }
                    }
                }
                return devideSet;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int k = sc.nextInt();
        Set<Composition> devideSet = new HashSet<Composition>();
        Composition Composition = new Composition();





    }
}
