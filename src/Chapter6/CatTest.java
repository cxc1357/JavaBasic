package Chapter6;

class Cat{
    private static long instanceCount = 0;
    public Cat(){
        System.out.println("执行无参数构造器");
        instanceCount ++;
    }
    public static long getInstanceCount(){
        return instanceCount;
    }
}

public class CatTest {
    public static void main(String[] args) {
        // 编译错误，for、while、do循环中的重复执行语句不能是一条单独的局部变量定义语句
        for(int i = 0; i < 10; i ++){
            Cat cat = new Cat();
        }
        System.out.println(Cat.getInstanceCount());
    }
}
