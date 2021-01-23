package Chapter6;

public class FloatCount {
    public static void main(String[] args) {
        // 精度丢失
        // 1.0E9 + 1 = 1.0E9
        final int START = 999999999;
        for(float i = START; i < START + 50; i ++){
            System.out.println("i的值：" + i + new java.util.Date());
        }
    }
}
