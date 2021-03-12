package myclass;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void testMap1(){
        Map map=new HashMap();
        map.put("aa",123);
        map.put(45,234);
        map.put("bb",123);
        map.put("aa",64);


        Map map1=new HashMap();
        map1.put("cc",123);
        map1.put("dd",123);

        map.putAll(map1);

        System.out.println(map);

        Object value=map.remove("aa");
        System.out.println(value);

        System.out.println(map);

//        map.clear();
//        System.out.println(map.size());

        boolean isexist=map.containsKey("b");
        System.out.println(isexist);

        System.out.println(map.get("cc"));





    }


}
