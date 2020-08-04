package algrithm;

import java.util.LinkedHashMap;
import java.util.Map;

class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int maxCapacity;

    LRULinkedHashMap(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > maxCapacity;
    }
}

class LRUTest {
    public static void main(String[] args) {
        LRULinkedHashMap<String,Integer> map = new LRULinkedHashMap<>(4);
        for(int i=0;i<50;i++) {
            map.put("aa"+i, i);
            for (Integer entry : map.values()) {
                System.out.print(entry + "--");
            }
            System.out.println();
        }
    }
}