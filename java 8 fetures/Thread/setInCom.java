package Thread;

import java.util.Set;
import java.util.TreeSet;

public class setInCom {

    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(243);
        s.add(2);

        System.out.println("before Sorting :"+s);

        Set<Integer> ss = new TreeSet<>((a,b)-> b-a);
        ss.add(22);
        ss.add(243);
        ss.add(2);

        System.out.println("after Sorting :"+ss);




    }
    
}
