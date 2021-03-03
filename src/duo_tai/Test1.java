package duo_tai;


public class Test1 {
    public static void main(String[] args)
    {
    Master master = new Master();
    Cat cat = new Cat();
    Dog dog = new Dog();
   // master.feed(new Cat());
   // master.feed(new Dog());
        master.feed(cat);
        master.feed(dog);
        master.feed(new Snake());
   // System.out.println(cat);
    }
}

