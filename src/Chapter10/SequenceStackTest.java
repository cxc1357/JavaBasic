package Chapter10;

public class SequenceStackTest {
    public static void main(String[] args) {
        SequenceStack<String> stack = new SequenceStack<String>();
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");
        stack.push("ddd");
        System.out.println(stack);
        System.out.println("访问栈顶元素："+stack.peek());
        System.out.println("第一次弹出栈顶元素："+stack.pop());
        System.out.println("第二次弹出栈顶元素："+stack.pop());
        System.out.println("两次pop后的栈："+stack);
    }
}
