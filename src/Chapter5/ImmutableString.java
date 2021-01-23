package Chapter5;

public class ImmutableString {
    public static void main(String[] args) {
        String str = "Hello ";
        System.out.println(System.identityHashCode(str));
        // 两个对象相同时，hashcode相等
        str = str + "Java";
        System.out.println(System.identityHashCode(str));
    }
}
