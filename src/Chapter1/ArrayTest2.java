package Chapter1;

public class ArrayTest2 {

    public static void main(String[] args) {
        // java中数组为引用类型
        // 初始化后，长度不可变
        // 存储相同类型元素

        // 静态初始化方法1
        String[] cities = new String[]{
                "北京",
                "天津",
                "南京",
                "广州"
        };

        // 静态初始化方法2
        String[] names = {
                "张三",
                "李四",
                "王五"
        };

        // 动态初始化方法
        // 只分配空间，不赋值
        String[] strArr = new String[5];

        cities = names;
        strArr = names;
        System.out.println("-----------");

        System.out.println("cities数组的长度：" + cities.length);
        System.out.println("strArr数组的长度：" + strArr.length);

        cities[1] = "杭州";
        System.out.println("cities数组第1个元素是：" + cities[0]);
        System.out.println("cities数组第2个元素是：" + cities[1]);
    }
}
