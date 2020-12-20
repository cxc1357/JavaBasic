package Chapter3;

import java.util.HashMap;
import java.util.TreeMap;

public class MapValueTest {
    public static void main(String[] args) {
        HashMap<String,Double> scores = new HashMap<String,Double>();
        scores.put("语文",90.0);
        scores.put("数学",70.0);
        scores.put("英文",50.0);

        System.out.println(scores.values());
        System.out.println(scores.values().getClass());

        TreeMap<String,Double> health = new TreeMap<String, Double>();
        health.put("身高",173.0);
        health.put("体重",73.0);

        System.out.println(health.values());
        System.out.println(health.values().getClass());
    }
}
