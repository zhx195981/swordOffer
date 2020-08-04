package logic;

import java.util.ArrayList;

/**
 * 求按从小到大的顺序的第N个丑数(2,3,5)
 * author:zhx
 *
 */
public class GetUglyNumber_Solution {

    public int get(int index){
        if(index <= 0)
            return 0;
        if(index > 0 && index < 7)
            return index;

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        for(int i = 1; i < index; i++){

            int min = Math.min(list.get(indexA)*2, Math.min(list.get(indexB)*3, list.get(indexC)*5));
            list.add(min);
            if(min == list.get(indexA)*2)
                indexA ++;
            if(min == list.get(indexB)*3)
                indexB++;
            if(min == list.get(indexC)*5)
                indexC++;

        }
        return list.get(index-1);
    }
}
