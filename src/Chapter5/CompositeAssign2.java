package Chapter5;

public class CompositeAssign2 {
    public static void main(String[] args) {
        Object he = new CompositeAssign2();
        String crazy = "crazyit.org,";
        // he调用toString()，自动转换为String
        crazy += he;
        System.out.println(crazy);
    }
}
