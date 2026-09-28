package Module2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetsBasics {
    public static void main(String[] args) {

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//

        //System.out.println("Set 1 : "+set1);
        //System.out.println("Set 2 : "+set2);
        //set1.retainAll(set2);//isko intersection bolte hai common element print ho jayenge
       // System.out.println("retainAll also known as Intersection : "+set1);

        //---CONTAINS ALL methods ---->
        //System.out.println(set1.containsAll(set2));
        //System.out.println(set2.containsAll(set1));



      //  Set<Integer> st = new HashSet<>();

        //Set<Integer> st = new LinkedHashSet<>();//-----> isse order preserve hota hai and duplicate element ni chaiye to LinkedHashSet ka use hum karte hai


       //-------TIME COMPLEXITY-----//
        //HasahedSet -> O(1)
        //LinkedHasahaedSet -> O(n)
        //TreeSEt -> BST O(logn)

//        Set<Integer> st = new TreeSet<>();
//        st.add(40);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        System.out.println(st);
        //set ke under agr hum koi sa abhi order dalde woh usko preesrve ni karta SET hamesah random saved element show karega humko

    }
}
