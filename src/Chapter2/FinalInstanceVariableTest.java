package Chapter2;

public class FinalInstanceVariableTest {
    // 在定义final变量时为var1赋值
    final int var1 = "hello".length();
    final int var2;
    final int var3;
    // 在初始化块中为var2赋值
    {
        var2="bigworld".length();
    }
    // 在构造器中为var3赋值
    public FinalInstanceVariableTest()
    {
        this.var3 = "whereareyou".length();
    }

    public static void main(String[] args) {
        FinalInstanceVariableTest fiv = new FinalInstanceVariableTest();
        System.out.println(fiv.var1);
        System.out.println(fiv.var2);
        System.out.println(fiv.var3);
    }

}
