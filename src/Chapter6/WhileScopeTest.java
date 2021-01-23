package Chapter6;

public class WhileScopeTest {
    public static void main(String[] args) {
        int i = 0;
        // 循环体内有两条语句时，不可省略花括号
        while(i < 10)
            System.out.println(i);
            i++;
    }
}