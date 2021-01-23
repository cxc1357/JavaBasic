package Chapter6;

import java.util.ArrayList;
import java.util.List;

public class tForEachErrorTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<String>();
        books.add("疯狂Java");
        books.add("疯狂Ajax");
        // 循环变量是临时变量，无法改变集合中的值，不应对循环变量赋值
        for(String book:books){
            book = "Ruby ON Rails 敏捷开发";
            System.out.println(book);
        }
        System.out.println(books);
    }
}
