package Chapter5;
// 三种实现多线程方式
// 继承Thread类（不推荐）
// 实现Runnable接口
// 实现Callable接口

// 本例用来演示第一种方法的潜在风险
public class InvokeRun extends Thread{
    private int i;
    // 重写run()
    public void run(){
        for(;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++){
            // 调用currentThread()获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 2){
                // 执行主线程main
                // i == 2 时，依次执行两个run()，不会启动新线程
                // 输出2后部分
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}

