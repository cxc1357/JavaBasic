package Chapter1;

public class PrimitiveArrayTest2 {
    public static void main(String[] args) {
        int[] iArr = null;
        // 定义后即可使用数组变量
        System.out.println(iArr);
        iArr = new int[5];
        // 只有iArr有效数组对象后才可访问属性
        System.out.println(iArr.length);
    }
}
