package Chapter2;

public class FinalTest {
    public static void main(String[] args) {
        final int a = 5 + 2;
        final double b = 1.2/3;
        final String str = "hello" + "you";
        // book1会被当做宏变量处理
        final String book1 = "crazyjava:" + 99.0;
        // 由于调用了String的类方法，book2不会被当作宏变量处理
        final String book2 = "crazyjava:" + String.valueOf(99.0);

        System.out.println(book1 == "crazyjava:99.0");
        System.out.println(book2 == "crazyjava:99.0");

        System.out.println(book1);
        System.out.println(book2);
    }
}
