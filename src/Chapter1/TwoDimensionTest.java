package Chapter1;

public class TwoDimensionTest {
    public static void main(String[] args) {
        // 定义二维数组
        int[][] a;
        // 按照一维数组的方式，初始化a为一个长度为4的数组
        a = new int[4][];
        for(int i = 0;i < a.length; i ++){
            System.out.println(a[i]);
        }
        // 初始化a的第一个元素
        a[0] = new int[2];
        a[0][1] = 6;
        for(int i = 0; i < a[0].length; i ++){
            System.out.println(a[0][i]);
        }
    }
}
