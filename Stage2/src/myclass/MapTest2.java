package myclass;

import org.junit.Test;

import java.util.*;

public class MapTest2 {
@Test
public void testMap2() {
    Map map = new HashMap();
    map.put("aa", 123);
    map.put(45, 234);
    map.put("bb", 1234);
    map.put("aa", 64);
//遍历key
    Set set=map.keySet();
    Iterator iterator=set.iterator();
    while(iterator.hasNext())
    {
        System.out.println(iterator.next());
    }

    //方式2
    Set keySet=map.keySet();
    Iterator iterator2=keySet.iterator();
    while(iterator2.hasNext()){
       Object key1=iterator2.next();
       Object value1=map.get(key1);
        System.out.println(key1+"--==--"+value1);

    }

//遍历values
    Collection values=map.values();
    for(Object obj :values){
        System.out.println(obj);
    }


//遍历所有key-value
    Set entrySet=map.entrySet();
    Iterator iterator1=entrySet.iterator();
    while(iterator1.hasNext()){
       // System.out.println(iterator1.next());
        Object obj=iterator1.next();
        Map.Entry entry=(Map.Entry)obj;
        System.out.println(entry.getKey()+"-----"+entry.getValue());
    }


}
}