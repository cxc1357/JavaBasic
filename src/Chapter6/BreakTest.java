package Chapter6;

public class BreakTest {
    public static void main(String[] args) {
        char score = 'C';
        // 没有break，所有分支都会执行
        switch (score){
            case 'A':
                System.out.println("优秀.");
            case 'B':
                System.out.println("良好.");
            case 'C':
                System.out.println("中.");
            case 'D':
                System.out.println("及格.");
            case 'E':
                System.out.println("不及格.");
            // 只有前面的分支都不执行，才会执行default
            default:
                System.out.println("成绩输入错误");
        }
    }
}
