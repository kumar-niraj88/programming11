package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mian1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(38);
        list.add(45);
        list.add(1);
        Collections.sort(list , (a,b) -> b-a);
        System.out.println(list);
    }
}
