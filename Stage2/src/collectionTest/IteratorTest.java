package collectionTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器
public class IteratorTest {
    @Test
    public void testit() {
        Collection coll5 = new ArrayList();
        coll5.add(123);
        coll5.add(456);
        coll5.add(new Person("Jerry", 20));
        coll5.add(new String("tom"));

        //正确写法
        Iterator iterator= coll5.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/
/*

        for (int i = 0; i <coll5.size() ; i++) {
            System.out.println(iterator.next());
        }
*/

    }
}
