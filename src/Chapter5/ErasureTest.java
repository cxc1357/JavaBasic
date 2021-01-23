package Chapter5;

class Apple<T extends Number>{
    T size;
    public Apple(){}
    public Apple(T size){
        this.size = size;
    }
    public void setSize(T size){
        this.size = size;
    }
    public T getSize(){
        return this.size;
    }
}

public class ErasureTest {
    public static void main(String[] args) {
        Apple<Integer> a = new Apple<Integer>(6);
        // a的getSize()返回Integer对象
        Integer as = a.getSize();
        // a赋值给Apple，丢失类型信息
        Apple b = a;
        // b只知道size的类型是Number
        Number size1 = b.getSize();
        // 编译错误
        // Integer size2 = b.getSize();
    }
}
