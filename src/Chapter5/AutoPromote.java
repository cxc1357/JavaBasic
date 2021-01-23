package Chapter5;

public class AutoPromote {
    public static void main(String[] args) {
        // 数据类型自动提升
        // char-->int-->long-->float-->double
        //         ^
        // byte-->short
        short sValue = 5;
        // 右边自动转成int，int赋值给short出错
        // sValue = sValue -2;
        // 正确写法，等价于sValue = (short) sValue - 2
        sValue -= 2;
        byte b = 40;
        char c = 'a';
        int i = 23;
        double d = .314;
        // 右边转为double
        double result = b + c + i*d;
        System.out.println(result);
        int val = 3;
        // 右边虽然不能整除，也为int
        int intResult = 23/val;
        System.out.println(intResult);
        // 连接运算，int转为String
        System.out.println("Hello"+7);
        // char当做int处理
        System.out.println('a'+7);
    }
}
