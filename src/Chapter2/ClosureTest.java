package Chapter2;

public class ClosureTest {
    public static void main(String[] args) {
        final String str = "Java";
        new Thread(new Runnable() {
            @Override
            // 只要线程中的run()方法没有执行完，内部类实例的生命周期就没有结束，可以一直访问到str，即内部类会扩大局部变量的作用域
            // 防止内部类可能会扩大局部变量的作用域，Java编译器要求所有被内部类访问的局部变量都要加final修饰
            public void run() {
                for(int i = 0 ; i < 100; i ++){
                    System.out.println(str +" "+i);
                    try{
                        Thread.sleep(100);
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
