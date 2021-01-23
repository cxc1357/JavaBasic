package Chapter5;

public class Account {
    private String accountNo;
    private double balance;
    public Account(){}

    public Account(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void draw(double drawAmount) {
        if (balance >= drawAmount) {
            System.out.println(Thread.currentThread().getName() +
                    "取钱成功，吐出钞票" + drawAmount);
            balance -= drawAmount;
            System.out.println("\t余额为：" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    "取钱失败，余额不足");
        }
    }

    public int hashCode(){
        return accountNo.hashCode();
    }

    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        if(obj != null && obj.getClass() == Account.class){
            Account target = (Account)obj;
            return target.accountNo.equals(accountNo);
        }
        return false;
    }
}
