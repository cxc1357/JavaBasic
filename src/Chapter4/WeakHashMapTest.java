package Chapter4;

import java.util.WeakHashMap;

class CrazyKey{
    String name;
    public CrazyKey(String name){
        this.name = name;
    }
    public int hashCode(){
        return name.hashCode();
    }
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj != null && obj.getClass() == CrazyKey.class){
            return name.equals(((CrazyKey)obj).name);
        }
        return false;
    }
    public String toString(){
        return "CrazyKey[name=" + name + "]";
    }
}

// 执行垃圾回收后，WeakHashMap中所有key-value对都会被清空，除非某些key还有强引用在引用它们
public class WeakHashMapTest {
    public static void main(String[] args) throws Exception{
        WeakHashMap<CrazyKey , String> map
                = new WeakHashMap<CrazyKey , String>();
        for(int i = 0; i < 10; i ++ ){
            map.put(new CrazyKey(i+1+""),"value" + (i + 11));
        }
        // 垃圾回收前，与普通HashMap无差别
        System.out.println(map);
        System.out.println(map.get(new CrazyKey("2")));
        // 垃圾回收
        System.gc();
        // 垃圾回收后，所有Entry全部清空
        Thread.sleep(50);
        System.out.println(map);
        System.out.println(map.get(new CrazyKey("2")));
    }
}
