package Chapter5;

public class StringJoinTest3 {
    public static void main(String[] args) {
        String str2 = "HelloJava9";
        String str1 = "Hello"+"Java"+"HelloJava".length();
        // 包含变量，不会指向字符串常量池
        System.out.println(str1==str2);
        int len = 9;
        String str3 = "Hello"+"Java"+len;
        // 包含方法调用，不会指向字符串常量池
        System.out.println(str1==str3);
    }
}
