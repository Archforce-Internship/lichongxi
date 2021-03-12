package CollectionS;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectonsTest {
    @Test
public void test1()
{
    List list=new ArrayList();
    list.add(123);
    list.add(456);
    list.add(122);
    list.add(133);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
    Collections.shuffle(list);
    System.out.println(list);

}

}
