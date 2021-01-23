package Chapter4;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

// 跟踪对象被垃圾回收的状态
// 通过检查与虚引用关联的引用队列中是否已经包含指定的虚引用，了解所引用对象是否将被回收
public class PhantomReferenceTest {
    public static void main(String[] args) {
        String str = new String("java 讲义");
        ReferenceQueue<String> rq = new ReferenceQueue<String>();
        PhantomReference<String> pr = new PhantomReference<>(str, rq);
        str = null;
        // 试图取出虚引用所引用的对象
        // 程序不能通过虚引用访问被引用的对象，此处输出null
        System.out.println(pr.get());
        // 垃圾回收
        System.gc();
        System.runFinalization();
        // 取出引用队列中最先进入的引用与pr进行比较
        System.out.println(rq.poll() == pr);
    }

}
