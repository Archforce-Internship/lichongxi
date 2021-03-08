package collectionTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest2 {
    public static void main(String[] args) {
        int a=10;
        Collection coll2=new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new Person("Jerry",20));
        coll2.add(new String("tom"));
        coll2.contains(new Person("Jerry",20));
        boolean contains=coll2.contains(1234);
        System.out.println(contains);
        System.out.println(coll2.contains(new String("Tom")));

        Collection col2= Arrays.asList(123,456);
        System.out.println(coll2.containsAll(col2));

    }
@Test
    public void test2()
    {
        Collection coll3=new ArrayList();
        coll3.add(123);
        coll3.add(456);
        coll3.add(new Person("Jerry",20));
        coll3.add(new String("tom"));
        coll3.contains(new Person("Jerry",20));
        coll3.remove(123);
        System.out.println(coll3);
        //coll3.remove(new Person("Jerry",20));
        Collection coll4=Arrays.asList(456,789);
        //求交集并赋值给调用者coll3
        coll3.retainAll(coll4);

        System.out.println(coll3);
        System.out.println(coll3.equals(coll4));
        System.out.println(coll3.hashCode());
        coll3.add(111);
        coll3.add(666);
        //集合到数组
        Object[] arr=coll3.toArray();
        for (Object i:arr) {
            System.out.println(i);
        }
        //数组转集合
        List<String> list =Arrays.asList((new String[]{"AA","BB","CC"}));
        System.out.println(list);
        //识别为一个
        List arr1=Arrays.asList(new int[]{123,456});
        System.out.println(arr1);

        List arr2=Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2);

    }
}
