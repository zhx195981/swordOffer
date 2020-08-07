package inputO;
import java.util.Scanner;
import java.util.ArrayList;
public class AB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        while(in.hasNext()){
            list.add(in.nextInt());
            list.add(in.nextInt());
        }
        int j = 0;
        while(j<list.size()-1){
            System.out.println(list.get(j) +  list.get(j+1));
            j = j+2;
        }
    }
}
