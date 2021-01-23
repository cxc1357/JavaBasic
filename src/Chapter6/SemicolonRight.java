package Chapter6;

public class SemicolonRight {
    public static void main(String[] args) {
        for(int j = 1, i = 0 ; i < 5 && j < 20; i ++ ,j *= 2){
            System.out.println(i + "-->" + j);
        }
    }
}
