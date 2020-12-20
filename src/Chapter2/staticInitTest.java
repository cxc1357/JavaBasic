package Chapter2;

// 类变量的初始化
public class staticInitTest {
    static int count = 2;
    static{
        System.out.println("staticInitTest的静态初始化块");
        name = "Java 编程";
    }
    static String name = "Java 讲义";

    public static void main(String[] args) {
        System.out.println("count变量的值："+staticInitTest.count);
        System.out.println("name变量的值："+staticInitTest.name);
    }
}
