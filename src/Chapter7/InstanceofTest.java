package Chapter7;

public class InstanceofTest {
    public static void main(String[] args) {
        Object hello = "Hello";
        System.out.println("字符串是否是Object的实例：" +
                 (hello instanceof Object));

        System.out.println("字符串是否是String的实例：" +
                (hello instanceof String));

        System.out.println("字符串是否是Math的实例：" +
                (hello instanceof Math));

        System.out.println("字符串是否是Comparable的实例：" +
                (hello instanceof Comparable));

        String str = "Hello";
// 编译错误，instanceof前的操作数的编译时类型必须与后面相同，或者是父类或子类
// System.out.println("字符串是否是Math类的实例：" + (str instanceof Math));

        System.out.println("字符串是否是Serializable类的实例："+
                (str instanceof java.io.Serializable));

    }
}
