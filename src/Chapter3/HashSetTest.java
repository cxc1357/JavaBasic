package Chapter3;

import java.util.HashSet;

class Name{
    private String first;
    private String last;

    public Name(String first, String last){
        this.first = first;
        this.last = last;
    }

    // 根据first判断两个Name是否相等
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o.getClass() == Name.class){
            Name n = (Name) o;
            return n.first.equals(first);
        }
        return false;
    }

    // 根据first计算Name对象的hashCode()返回值
    @Override
    public int hashCode() {
        return first.hashCode();
    }
    public String toString(){
        return "Name[first="+first+",last="+last+"]";
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Name> set = new HashSet<Name>();
        set.add(new Name("abc","123"));
        // 已经存在first="abc"的元素，无法添加
        set.add(new Name("abc","456"));
        System.out.println(set);
    }
}
