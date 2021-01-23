package Chapter6;

public class DefaultTest {
    public static void main(String[] args) {
        char score = 'C';
        switch (score){
            case 'A':
                System.out.println("优秀.");
                break;
            case 'B':
                System.out.println("良好.");
                break;
            case 'C':
                System.out.println("中.");
                break;
            case 'D':
                System.out.println("及格.");
                break;
            case 'E':
                System.out.println("不及格.");
                break;
            // 只有前面的分支都不执行，才会执行default
            default:
                System.out.println("成绩输入错误");
        }
    }
}
