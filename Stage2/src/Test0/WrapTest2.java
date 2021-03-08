package Test0;

public class WrapTest2 {
    public static void main(String[] args) {

        //连接运算
        int num1=10;
        String str1=num1+"";

        //基本转为String
        float f1=134f;
        String str2=String.valueOf(f1);
        System.out.println(str2);
        System.out.println(str1);

        //String转为基本数据类型
        int num2=Integer.parseInt(str1);
        System.out.println(num2);

    }
}
