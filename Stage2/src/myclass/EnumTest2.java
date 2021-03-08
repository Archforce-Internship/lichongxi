package myclass;

import java.sql.SQLOutput;

interface Info{
    void show();
}

public class EnumTest2 {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        Season2 winter = Season2.WINTER;
        System.out.println(autumn.toString());
        System.out.println(winter);

        System.out.println(Season2.class.getSuperclass());
        Season2[] values = Season2.values();
        for(int i=0;i<values.length;i++)
        {
            System.out.println(values[i]);
            values[i].show();
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }
       // winter.show();

    }
}

enum Season2 implements Info{

    SPRING("春天", "春暖花开")
            {
                @Override
                public void show() {
                    System.out.println("where is spring");
                }
            },
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地");


    private final String seasonName;
    private final String seasonDesc;

    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
public void show(){
    System.out.println("this is season");
}

}

