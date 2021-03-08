package myclass;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTime {
    @Test
    public  void  mytimeTest() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date date= new Date();
        System.out.println(date);
        String format=sdf.format(date);
        System.out.println(format);
        String str = "2021/3/8 上午10:51";
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        //格式化
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1=sdf1.format(date);
        System.out.println(format1);
        //解析
        Date date2= sdf1.parse("2021-03-08 11:18:25");
        System.out.println(date2);


 }


}
