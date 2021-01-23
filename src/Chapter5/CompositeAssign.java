package Chapter5;

public class CompositeAssign {
    public static void main(String[] args) {
        short st = 5;
        st += 10;
        System.out.println(st);
        // 结果错误，隐式转换发生高位截断
        // st = (short)(90010)
        // short范围：-32768~32767
        st += 90000;
        System.out.println(st);
    }
}
