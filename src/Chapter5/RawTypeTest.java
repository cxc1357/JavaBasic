package Chapter5;

import java.util.ArrayList;
import java.util.List;

public class RawTypeTest {
    public static void main(String[] args) {
        // 不带泛型的List
        List list = new ArrayList();
        // 添加元素
        list.add("Java讲义");
        list.add("JavaEE企业应用实战");
        list.add("疯狂Java");

        // 将List赋值给List<Integer>
        // 编译器将intList中所有元素当做Integer处理，遍历时不会报错
        List<Integer> intList = list;
        for(int i = 0 ; i < intList.size();i++){
            System.out.println(intList.get(i));
        }
    }

}
