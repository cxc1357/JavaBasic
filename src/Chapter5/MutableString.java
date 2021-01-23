package Chapter5;

public class MutableString {
    public static void main(String[] args) {
        // 若字符串会发生改变，使用StringBuilder和StringBuffer
        // StringBuilder是线程安全的
        StringBuilder str = new StringBuilder("Hello ");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        str.append("Java");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}
