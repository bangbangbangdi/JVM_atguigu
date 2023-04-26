package java.lang;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak1 {
    public static List list = new ArrayList();

    public void oomTest(){
        Object obj = new Object();
        list.add(obj);
    }
}
