import extendTest.CreateAccout;

public class ExtendTest {
    public static void main(String[] args)
    {
        CreateAccout accout1=new CreateAccout();
        accout1.setCredit(111);
        accout1.setActno("zhangsan");
        accout1.setBalance(10000.0);
        System.out.println(accout1.getCredit()+"--"+accout1.getActno()+"--"+accout1.getBalance());
    }
}
