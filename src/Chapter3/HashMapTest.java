package Chapter3;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<String, Double>();
        map.put("语文",80.0);
        map.put("数学",89.0);
        map.put("英语",78.0);
        System.out.println(map);
    }
}
