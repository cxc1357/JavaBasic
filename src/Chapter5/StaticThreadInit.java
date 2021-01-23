package Chapter5;

public class StaticThreadInit {
    // 在静态初始化块中定义线程执行初始化操作
    // 可通过编译，但运行时触发死锁
    static{
        Thread t = new Thread(){
            public void run(){
                System.out.println("进入run方法");
                System.out.println(website);
                website = "www.leegang.org";
                System.out.println("退出run方法");
            }
        };
        t.start();
        try{
            t.join();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    static String website = "www.crazyit.org";

    public static void main(String[] args) {
        System.out.println(StaticThreadInit.website);
    }
}
