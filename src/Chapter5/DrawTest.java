package Chapter5;

class DrawThread extends Thread{
    private AccountSyn accouont;
    private double drawAmount;
    public DrawThread(String name,AccountSyn account,double drawAmount){
        super(name);
        this.accouont = account;
        this.drawAmount = drawAmount;
    }
    public void run(){
        accouont.draw(drawAmount);
    }
}

public class DrawTest{
    public static void main(String[] args) {
        AccountSyn acct = new AccountSyn("1234567",1000);
        new DrawThread("甲", acct, 800).start();
        new DrawThread("乙", acct, 800).start();
    }
}
