package Chapter5;

public class AccountSyn {
    private String accountNo;
    private double balance;
    public AccountSyn(){}
    public AccountSyn(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public synchronized double getBalance(){
        return this.balance;
    }

    public synchronized void draw(double drawAmount){
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
            AccountSyn target = (AccountSyn)obj;
            return target.accountNo.equals(accountNo);
        }
        return false;
    }
}