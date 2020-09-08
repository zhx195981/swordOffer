package Company.meiTuan;
import java.util.*;
class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private static final long serialVersionUID = 1L;
    private static final int MAX_ENTRIES = Integer.MAX_VALUE;

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }

    public LRUCache() {
        super(16, 0.75f, true);
    }
    public static void main(String[] args) {
        Map<Integer, String> cache = Collections.synchronizedMap(new LRUCache<>());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- > 0) {
            cache.put(sc.nextInt(), "a");
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for (Integer integer : cache.keySet()) {
            ls.add(0,integer);
        }
        for (Integer l : ls) {
            System.out.println(l);
        }

    }
}