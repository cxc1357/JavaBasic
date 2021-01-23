package Chapter5;

public class StringJoinTest {
    public static void main(String[] args) {
        String str1 = "HelloJava10";
        String str2 = "Hello" + "Java" + 10;
        // 编译时确定，可以利用字符串常量池中字符串
        System.out.println(str1 == str2);
    }
}
