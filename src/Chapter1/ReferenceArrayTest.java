package Chapter1;

class Person{
    public int age;
    public double height;
    public void info(){
        System.out.println("年龄："+"age"+"身高："+"height");
    }
}

public class ReferenceArrayTest {
    public static void main(String[] args) {
        Person[] students;
        students = new Person[2];
        System.out.println("students所引用数组的长度："+students.length);
        Person zhang = new Person();
        zhang.age = 15;
        zhang.height = 167;

        Person lee = new Person();
        lee.age = 16;
        lee.height = 161;

        students[0] = zhang;
        students[1] = lee;

        lee.info();
        students[1].info();
    }
}
