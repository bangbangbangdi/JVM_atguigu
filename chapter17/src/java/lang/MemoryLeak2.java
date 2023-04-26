package java.lang;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak2 {
    private static MemoryLeak2 obj = new MemoryLeak2();
    private MemoryLeak2(){}
    public static MemoryLeak2 getMemory2(){
        return obj;
    }
}
