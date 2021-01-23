package Chapter7;

public class ConversionTest {
    public static void main(String[] args) {
        Object obj = "Hello";
        String objStr = (String)obj;
        System.out.println(objStr);
        Object objPri = new Integer(5);
        String str = (String)objPri;
        String s = "疯狂Java讲义";
        //Math m = (Math)s;
    }
}
