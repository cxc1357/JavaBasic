package Chapter4;

// 对于强引用，无论系统内存多紧张，JVM都不会回收被强引用所引用的对象，最终会导致程序因内存不足而终止
public class StrongReferenceTest {
    public static void main(String[] args) {
        Person[] people =
                new Person[10000];
        for(int i = 0 ; i < people.length ; i ++){
            people[i] = new Person(
                    "名字 " + i, (i+1) * 4 % 100);
        }
        System.out.println(people[2]);
        System.out.println(people[4]);
        System.gc();
        System.runFinalization();
        System.out.println(people[2]);
        System.out.println(people[4]);
    }
}
