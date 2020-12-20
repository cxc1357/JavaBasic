package Chapter2;

class Price {
    final static Price INSTANCE = new Price(2.8);
    static double initPrice = 20;

    double currentPrice;
    public Price(double discount){
        currentPrice = initPrice - discount;
    }
}

// 输出：-2.8，17.2
// Price类初始化，initPrice的值为0，INSTANCE引用一个currentPrice为-2.8的Price实例
// initPrice赋值为20，再次创建Price实例，currentPrice=17.2
public class PriceTest{
    public static void main(String[] args) {
        System.out.println(Price.INSTANCE.currentPrice);
        Price p = new Price(2.8);
        System.out.println(p.currentPrice);
    }
}
