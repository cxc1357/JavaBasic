package Chapter3;

public class Set2MapTest {
    public static void main(String[] args) {
        Set2Map<String,Integer> scores =
                new Set2Map<String,Integer>();
        scores.put("语文",89);
        scores.put("数学",83);
        scores.put("英文",80);
        System.out.println(scores);
        System.out.println(scores.size());
        scores.removeEntry("数学");
        System.out.println("删除key为\"数学\"的Entry后："+ scores);
        System.out.println("语文成绩："+ scores.get("语文"));
        // 是否包含指定key
        System.out.println("是否包含\"英文\"key:"+scores.containsKey("英文"));
        // 是否包含指定value
        System.out.println("是否包含 82 value："+scores.containsValue(82));
        // 清空集合
        scores.clear();
        System.out.println("执行clear()方法后的集合："+scores);
    }
}
