package Thread;

import java.util.Map;
import java.util.TreeMap;

public class mapIncomp {
    public static void main(String[] args) {
    Map<Integer , String> m = new TreeMap<>();
    m.put(2, "niraj");
    m.put(1, "karan");
    m.put(3, "prince");

    System.out.println("without using lambda expression"+m);

    Map<Integer , String> mm = new TreeMap<>((a,b)-> b-a);
    mm.put(2, "niraj");
    mm.put(1, "karan");
    mm.put(3, "prince");

    System.out.println("without using lambda expression"+mm);
    }
}
