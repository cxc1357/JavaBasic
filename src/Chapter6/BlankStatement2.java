package Chapter6;

public class BlankStatement2 {
    public static void main(String[] args) {
        double price = 99.0;
        // if在分号结束，后面的会一直执行
        if(price < 50);{
            System.out.println("价格挺便宜");
        }
    }
}
