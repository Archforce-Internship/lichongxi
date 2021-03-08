package Test0;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

//ArrayList

public class CollectionTest1 {
    @Test
    public void test1()
    {
        Collection coll=new ArrayList();
        //add(Obiect e)
        coll.add("aa");
        coll.add("BB");
        coll.add("123");
        coll.add(new Date());
        //size获取添加的个数
        System.out.println(coll.size());
        Collection coll1=new ArrayList();


        coll1.add("cc");
        coll1.add("ee");
        coll.addAll(coll1);

        System.out.println(coll.size());
        coll.clear();
        System.out.println(coll.size());

    }

}
