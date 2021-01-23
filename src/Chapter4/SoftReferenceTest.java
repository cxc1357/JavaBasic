package Chapter4;

import java.lang.ref.SoftReference;


class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Person[name = " + name
        + " age = " + age + "]";
    }
}

// 只具有软引用的对象会被垃圾回收
// 将JVM内存设为2M，程序创建一个长度10000的数组，导致内存紧张，软引用的对象被垃圾回收
public class SoftReferenceTest {
    public static void main(String[] args) {
        SoftReference<Person>[] people =
                new SoftReference[10000];
        for(int i = 0 ; i < people.length ; i ++){
            people[i] = new SoftReference<Person>(new Person(
                    "名字 " + i, (i+1) * 4 % 100));
        }
        System.out.println(people[2].get());
        System.out.println(people[4].get());
        System.gc();
        System.runFinalization();
        System.out.println(people[2].get());
        System.out.println(people[4].get());
    }
}
