package Chapter4;

public class StatusTranfer {
    public static void test(){
        String a = new String("疯狂Java讲义");
        // 由可达状态失去引用，转为可恢复状态
        a = new String("轻量级Java EE企业应用实战");
    }
    public static void main(String[] args) {
        test();
    }
}
