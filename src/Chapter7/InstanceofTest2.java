package Chapter7;

public class InstanceofTest2 {
    public static void main(String[] args) {
        Object str = "疯狂Java讲义";
        Math math = (Math)str;
    // 编译错误
    // System.out.println("字符串是否是String的实例：" +
    // (math instanceof String));
    }
}
