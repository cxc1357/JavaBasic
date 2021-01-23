package Chapter9;

public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<String> list = new SequenceList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.insert("ddd",1);
        System.out.println(list);
        list.delete(2);
        System.out.println(list);
        System.out.println("ccc在顺序表中位置:"+list.locate("ccc"));
    }
}
