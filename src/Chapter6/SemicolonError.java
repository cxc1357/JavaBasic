package Chapter6;

public class SemicolonError {
    public static void main(String[] args) {
        String[] books = {
            "疯狂Java讲义",
            "Java EE应用实战",
            "疯狂XML讲义"
        };
        for(int i = 0 ; i < books.length; i ++)
        {
            System.out.println("第i个元素的值："+books[i]);
        }
    }
}
