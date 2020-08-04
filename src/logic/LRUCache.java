package logic;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer,Integer> map;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        Integer value = map.remove(key);
        map.put(key, value);
        return value;

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key, value);
            return;
        }
        map.put(key,value);
        if(map.size() > capacity)
            map.remove(map.entrySet().iterator().next().getKey());
    }
}
