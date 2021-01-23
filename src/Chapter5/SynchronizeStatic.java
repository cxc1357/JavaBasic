package Chapter5;

// 实现了Runnable，可作为线程target运行
class SynchronizeStatic implements Runnable{
    static boolean staticFalg = true;

    // 关键字synchronized修饰同步方法
    // 任何线程进入同步方法前，需获取同步方法对应的同步监视器
    // 对于同步静态方法，监视器为该类本身
    // 对于同步非静态方法，监视器为this
    // 对于同步代码块，需指定监视器

    // 同步方法
    public static synchronized void test0(){
        for(int i = 0; i < 100; i ++){
            System.out.println("test0:"+
                    Thread.currentThread().getName()+" "+i);
        }
    }

    // 同步代码块
    public void test1(){
        synchronized (this){
            for(int i = 0; i < 100; i ++){
                System.out.println("test1:"+
                        Thread.currentThread().getName()+" "+i);
            }
        }
    }

    public void run() {
         if(staticFalg){
             staticFalg = false;
             test0();
         }else{
             staticFalg = true;
             test1();
         }
    }

    public static void main(String[] args) throws Exception{
        SynchronizeStatic ss = new SynchronizeStatic();
        // 第一条线程获得SynchronizeStatic类的锁定
        new Thread(ss).start();
        Thread.sleep(100);
        // 第二条线程获得ss的锁定
        new Thread(ss).start();
    }
}
