package customer;

public class Test1 {
    public static void main(String[] args) {
        FoodMenu cooker1 = new ChinaCooker();
        FoodMenu cooker2 = new Amercancooker();
        Customer cust1 = new Customer(cooker1);
        cust1.order();
        Customer cust2 = new Customer(cooker2);
        cust2.order();
    }
}
