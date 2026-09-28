package Module2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetsBasics {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        //Hume iski  need kyu padi hai, dekhte hai jaise ki Set ki jo functionality hai wo hai ki isme to dublicate value store hi ni hoti,

        Student s1 = new Student(1, "Aryan");
        Student s2 = new Student(1, "Aryan");
        Student s3 = new Student(1, "Aryan");


        set.add(s1);
        set.add(s2);
        set.add(s3);
        //-----isse duplicate element print ho rha hai usne 3eeno element alag alag store akr lie hai --> jab bhi custom type of data ko implement kar rha hu mein mujhe 2 tarah ke method ko implement karna padega tab ja ke wo ek element treat karega so basically mene ek rule banaya -------1.ki name same ho skta hai , but rollno. unique hona chaiye

        System.out.println(set);// is stage pe mene isko direct RUN kia tha, direct run se usse iska output ni aya desired output ni aya kyunki hume uska toStringmethod rakhna padega to wo hum Student class mein rakh ke ayenge fir code desired output mein run hoga




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
