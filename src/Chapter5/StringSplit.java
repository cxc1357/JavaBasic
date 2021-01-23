package Chapter5;

public class StringSplit {
    public static void main(String[] args) {
        String str = "java.is.funny.www.crazyit.org";
        // 正则表达式分割字符串
        String[] strArr = str.split("\\.");
        for(String s:strArr){
            System.out.println(s);
        }
        // replace()
        String path1 = str.replace(".","\\");
        System.out.println(path1);
        // replaceAll()
        String path2 = str.replaceAll("\\.","\\\\");
        System.out.println(path2);

    }
}
