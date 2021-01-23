package Chapter5;

import java.util.ArrayList;
import java.util.List;

public class RawTypeTest2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java讲义");
        list.add("JavaEE企业应用实战");
        list.add("疯狂Java");

        // 将List赋值给List<Integer>
        // 编译器将intList中所有元素当做Integer处理，但实际上均为String
        // 可以通过编译，但运行时报错
        List<Integer> intList = list;
        for(int i = 0 ; i < intList.size();i++){
            // 相当于Integer in = (Integer)intList.get(i)，强转引发ClassCastException
            Integer in = intList.get(i);
            // 若写作String in = intList.get(i)，依然出错，相当于将Integer赋给String
            System.out.println(in);
        }
    }
}
