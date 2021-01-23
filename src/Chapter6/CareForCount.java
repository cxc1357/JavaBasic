package Chapter6;

public class CareForCount {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            System.out.println("i的值为：" + i);
            // 相当于i = (int)i * 0.1;
            i *= 0.1;
        }
    }
}
