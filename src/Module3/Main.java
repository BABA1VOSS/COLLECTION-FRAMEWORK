package Module3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(2);
        list.add(90);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
    //MAP / Comparable / comparator
    //Ques - What is Map interface
}
