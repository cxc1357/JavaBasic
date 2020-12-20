package Chapter3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        for(Iterator<String> it = list.iterator();it.hasNext();){
            String ele = it.next();
            // 使用Iterator进行迭代时，通常不应删除元素
            // 删除222不会引发异常
            if(ele.equals("222")){
                list.remove(ele);
            }
        }
    }
}
