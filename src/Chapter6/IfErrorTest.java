package Chapter6;

public class IfErrorTest {
    public static void main(String[] args) {
        int age = 45;
        if(age>20){
            System.out.println("青年人");
        }
        // 相当于：if(age > 40 && !(age > 20))
        // 即：if(age > 40 && age <= 20)
        // 这样的情况永远不会发生
        else if(age>40){
            System.out.println("中年人");
        }
        else if(age>60){
            System.out.println("老年人");
        }
    }
}
