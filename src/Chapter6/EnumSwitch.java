package Chapter6;

enum Season{
    SPRING,SUMMER,FALL,WINTER
}

public class EnumSwitch {
    public static void main(String[] args) {
        Season s = Season.FALL;
        // case中访问枚举类型不用加枚举类名作为限定
        switch(s){
            case SPRING:
                System.out.println("春天不是读书天");
                break;
            case SUMMER:
                System.out.println("夏日炎炎好睡眠");
                break;
            case FALL:
                System.out.println("秋多玫瑰");
                break;
            case WINTER:
                System.out.println("冬日冷");
                break;
        }
    }
}
