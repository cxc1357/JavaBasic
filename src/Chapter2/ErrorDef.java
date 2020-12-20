package Chapter2;

// 报错：非法的前向引用
//public class ErrorDef {
//    int num1 = num2 + 2;
//    int num2 = 20;
//}

// 使用static修饰的成员变量是类变量，属于该类本身
// 没有使用static修饰的变量是实例变量，属于该类的实例
public class ErrorDef {
    int num1 = num2 + 2;
    static int num2 = 20;
}

