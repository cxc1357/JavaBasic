package Chapter6;

public class SwitchTest {
    public static void main(String[] args) {
        int a = 5;
        switch((int)(a + 1.2 + 0.8)){
        // 编译错误：精度损失
        // switch (a + 1.2 + 0.8){
            case 6:
                System.out.println("结果等于6");
                break;
            case 7:
                System.out.println("结果等于7");
                break;
            case 8:
                System.out.println("结果等于8");
                break;
            default:
                System.out.println("结果等于其他值");
                break;
        }
    }
}
