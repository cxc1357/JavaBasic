package Chapter2;
// Java 对象的3种初始化方式：构造器、初始化块、定义变量时指定初始值
// 初始化顺序：初始化块->构造器
class Cat {
    String name;
    int age;

    public Cat(String name, int age){
        System.out.println("执行构造器");
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("执行非静态初始化块");
        weight = 2.0;
    }

    // 相当于：
    // double weight;
    // weight = 2.3;
    double weight = 2.3;
    public String toString(){
        return "Cat[name="+name+",age="+age+",weight="+weight+"]";
    }
}

public class initTest{
    public static void main(String[] args) {
        Cat cat = new Cat("kitty",2);
        System.out.println(cat);
        Cat c2 = new Cat("Jerfield",3);
        System.out.println(c2);
    }
}