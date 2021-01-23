package Chapter4;

import java.lang.ref.WeakReference;

// 由于垃圾回收不受控制，弱引用可能会导致空指针异常
public class WeakReferenceTest {
    public static void main(String[] args) {
        // 创建强引用，指向字符串
        String str = new String("Java讲义");
        // 创建弱引用，指向字符串
        WeakReference<String> wr = new WeakReference<>(str);
        // 切断强引用和字符串之间的联系
        str = null;
        // 取出弱引用指向对象
        System.out.println(wr.get());
        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 再次取出弱引用对象
        System.out.println(wr.get());
    }
}
