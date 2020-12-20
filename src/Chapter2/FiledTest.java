package Chapter2;

class Person{
    String name;
    int age;
    static int eyeNum;
    public void info(){
        System.out.println("我的名字是"+name
                +"，我的年龄是："+age);
    }
}

public class FiledTest {
    public static void main(String[] args) {
        Person.eyeNum = 2;
        System.out.println("Person的eyeNum属性："+Person.eyeNum);
        Person p = new Person();

        p.name = "猪八戒";
        p.age = 300;
        System.out.println("通过p访问eyeNum类变量："+p.eyeNum);
        p.info();

        Person p2 = new Person();
        p2.name = "孙悟空";
        p2.age = 500;
        p2.info();
        p2.eyeNum = 3;

        System.out.println("通过p访问eyeNum类变量："+p.eyeNum);
        System.out.println("通过p2访问eyeNum类变量："+p2.eyeNum);
        System.out.println("通过Person类访问eyeNum类变量："+Person.eyeNum);
    }
}
