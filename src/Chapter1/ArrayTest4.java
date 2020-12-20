package Chapter1;

class Cat{
    double weight;
    int age;
    public Cat(double weight,int age){
        this.weight = weight;
        this.age = age;
    }
}

public class ArrayTest4 {
    public static void main(String[] args) {
        // 定义并初始化一个int数组
        int[] pos = new int[5];
        // 赋值
        for(int i = 0; i < pos.length ; i ++){
            pos[i] = (i+1) * 2;
        }
        // 可将数组元素的值赋给int变量，也可将int变量的值赋给数组元素
        int a = pos[1];
        int b = 20;
        pos[2] = b;

        // 定义并初始化一个Cat[]数组
        Cat[] cats = new Cat[2];
        cats[0] = new Cat(3.34,2);
        cats[1] = new Cat(3.2,3);
        // 将cats的第一个元素赋给c1
        Cat c1 = cats[0];
        Cat c2 = new Cat(4.3,3);
        // 将c2赋给cats数组的第二个元素
        cats[1] = c2;
    }
}
