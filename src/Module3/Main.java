package Module3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        //custom class ke lie humne comparable interface implement hi ni kia to pehle wahi karenge (humne Student m implement kia or tabhi collection.sort chal jayega)..
        students.add(new Student(19, "vipul", 60));
        students.add(new Student(23, "Love", 87));
        students.add(new Student(23, "Ankit", 55));
        students.add(new Student(7,  "Aryan", 13));
        System.out.println(students);

       Collections.sort(students);
        System.out.println(students);
        // yeh issue isliye aarha hai kyunki humne koi comparable interface define nahi ki hai , for eg;- by default agar maine String ya integer di hoti to woh sort ho jati lekin agar koi bhi collection ko sort karna hai to pehle usko comparable interface implement karna  padega


//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);
//
    }
}

