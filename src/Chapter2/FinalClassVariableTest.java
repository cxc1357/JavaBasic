package Chapter2;

public class FinalClassVariableTest {
    final static int var1 = "hello".length();
    final static int var2;

    static{
        var2 = "lala".length();
    }

    public static void main(String[] args) {
        System.out.println(FinalClassVariableTest.var1);
        System.out.println(FinalClassVariableTest.var2);
    }
}
