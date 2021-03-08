package annotation;

public class AnnotationTest1 {

}

class Person{
    private  String name;
    private int age;

    public Person() {
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk()
    {
        System.out.println("人走路");
    }
    public void eat()
    {
        System.out.println("人吃饭");
    }


}

interface Info1{
    void show();
}
class Student extends Person implements Info1{
    public void walk()
    {
        System.out.println("学生走路");
    }

    @Override
    public void show()
    {
    }
}


