package Chapter3;

import sun.reflect.generics.repository.GenericDeclRepository;

import java.util.*;

enum Gender{
    MALE,FEMALE;
}

public class IteratorTest {
    public static void main(String[] args) {
        // 所有Set集合的Iterator都是它对应的Map集合的Iterator
        // set底层通过map实现
        HashSet<String> hashSet = new HashSet<String>();
        System.out.println("HashSet的Iterator："+hashSet.iterator());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println("HashSet的Iterator：" + linkedHashSet.iterator());

        TreeSet<String> treeSet = new TreeSet<String>();
        System.out.println("TreeSet的Iterator："+treeSet.iterator());

        EnumSet<Gender> enumSet = EnumSet.allOf(Gender.class);
        System.out.println("EnumSet的Iterator："+enumSet.iterator());

        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("ArrayList的Iterator："+arrayList.iterator());

        Vector<String> vector = new Vector<String>();
        System.out.println("Vector的Iterator："+vector.iterator());

        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println("LinkedList的Iterator："+ linkedList.iterator());

        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        System.out.println("ArrayDeque的Iterator："+arrayDeque.iterator());

    }
}
