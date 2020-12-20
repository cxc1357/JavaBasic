package Chapter1;

public class ArrayTest3 {
    public static void main(String[] args) {
        // 数组对象初始化
        int[] nums = new int[]{3,5,20,12};
        int[] prices;
        // 数组变量指向有效的数组对象，不需要初始化
        prices = nums;
        for(int i = 0 ; i < prices.length; i++){
            System.out.println(prices[i]);
        }
        prices[2] = 34;
        System.out.println("nums 数组的第3个元素的值是："+nums[2]);
    }
}
