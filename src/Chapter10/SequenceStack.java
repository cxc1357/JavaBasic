package Chapter10;

import java.util.Arrays;

//基于数组实现栈
public class SequenceStack<T>{
    private int DEFAULT_SIZE = 10;
    private int capacity;
    private int capacityIncrement = 0;
    private Object[] elementData;
    private int size = 0;
    public SequenceStack(){
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }
    public SequenceStack(T element){
        this();
        elementData[0] = element;
        size ++;
    }
    public SequenceStack(T element,int initSize){
        this.capacity = initSize;
        elementData = new Object[capacity];
        elementData[0] = element;
        size ++;
    }
    public SequenceStack(T element, int initSize, int capacityIncrement){
        this.capacity = initSize;
        this.capacityIncrement = capacityIncrement;
        elementData = new Object[capacity];
        elementData[0] = element;
        size ++;
    }
    // 获取栈大小
    public int length(){
        return size;
    }
    // 入栈
    public void push(T element){
        ensureCapacity(size + 1);
        elementData[size++] = element;
    }
    private void ensureCapacity(int minCapacity){
        if(minCapacity > capacity){
            if(capacityIncrement > 0){
                while(capacity < minCapacity){
                    capacity += capacityIncrement;
                }
            }else{
                // 不断将capacity * 2，直到capacity大于minCapacity为止
                while(capacity < minCapacity){
                    capacity <<= 1;
                }
            }
            elementData = Arrays.copyOf(elementData,capacity);
        }
    }
    // 出栈
    public T pop(){
        T oldValue = (T)elementData[size - 1];
        elementData[--size] = null;
        return oldValue;
    }
    // 返回栈顶元素，但不删除
    public T peek(){
        return (T)elementData[size - 1];
    }
    public boolean empty(){
        return size == 0;
    }
    public void clear(){
        Arrays.fill(elementData,null);
        size = 0;
    }
    public String toString(){
        if(size == 0){
            return "[]";
        }else{
            StringBuilder sb = new StringBuilder("[");
            for(int i = size -1 ; i > -1; i --){
                sb.append(elementData[i].toString() + ", ");
            }
            int len = sb.length();
            return sb.delete(len - 2, len).append("]").toString();
        }
    }
}
