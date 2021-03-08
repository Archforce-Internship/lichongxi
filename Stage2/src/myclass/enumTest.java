package myclass;

public class enumTest {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;
        Season1 winter = Season1.WINTER;
        System.out.println(autumn.toString());
        System.out.println(winter);
        System.out.println(Season1.class.getSuperclass());

        Season1[] values = Season1.values();
        for(int i=0;i<values.length;i++)
        {
            System.out.println(values[i]);
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

    }
}

enum Season1 {

    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地");


    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc) {
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


}
