package homework;

public class VehicleTest {
    public static void main(String[] args)
    {
        Vehicle v=new Vehicle(88,100);
        v.move();
        v.speedUp(100);
        v.move();
        v.speedDown(20);
        v.move();
        v.setSpeed(666);
        v.move();
    }
}
