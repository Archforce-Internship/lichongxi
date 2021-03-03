package homework;

public class Vehicle {
    private double speed;
    private int size;
    public Vehicle(double sp,int size)
    {
        this.speed=sp;
        this.size=size;
    }

    public void move()
    {
        System.out.println("sudu is "+speed+"  size is "+size);
    }
    public void setSpeed(double s)
    {
        this.speed=s;
    }
    public double speedUp(double speedup)
    {
        this.speed=this.speed+speedup;
        return speed;
    }
    public double speedDown(double speedlow)
    {
        this.speed=this.speed-speedlow;
        return this.speed;
    }
}
