package Chapter6;

public class FloatCount2 {
    public static void main(String[] args) {
        final int START = 999999999;
        for(float i = START; i < START + 20; i ++){
            System.out.println("i的值："+i+new java.util.Date());
        }
    }
}
