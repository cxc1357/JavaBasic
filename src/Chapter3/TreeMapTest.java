package Chapter3;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,Double> map = new TreeMap<String,Double>();
        map.put("aaa",80.0);
        map.put("bbb",90.0);
        map.put("ccc",60.0);
        System.out.println(map);
    }
}
