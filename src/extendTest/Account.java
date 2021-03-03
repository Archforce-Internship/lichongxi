package extendTest;

public class Account {
    private String actno;
    private double balance;

    public Account()
    {

    }
    public Account(String actno,double banlace)
    {
        this.actno=actno;
        this.balance=banlace;

    }
    public String getActno()
    {
        return actno;
    }
    public void setActno(String actno)
    {
        this.actno=actno;
    }
    public double getBalance()
    {
        return balance;

    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }


}


