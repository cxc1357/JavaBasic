package Chapter2;

public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "crazyjava";
        // 编译阶段确定值后，直接指向缓冲池中的"crazyjava"
        String s2 = "crazy" + "java";
        System.out.println(s1 == s2);

        String str1 = "crazy";
        String str2 = "java";
        String s3 = str1 + str2;
        // 编译阶段无法确定值，不会指向缓冲池中的"crazyjava"
        System.out.println(s1 == s3);

        final String str3 = "crazy";
        final String str4 = "java";
        String s4 = str3 + str4;
        // 编译阶段可以确定值
        System.out.println(s1 == s4);
    }
}
