package Chapter5;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("z");
        String s3 = new String("abc");
        if(s1.compareTo(s3)==0){
            System.out.println("s1和s3包含的字符序列相等");
        }
        if(s1.compareTo(s2)<0){
            System.out.println("s1小于s2");
        }
        System.out.println("s1和s3包含的字符序列是否相同：" + s1.equals(s3));
        System.out.println("s1和s3所指的字符是否相同：" + (s1==s3));
    }
}
