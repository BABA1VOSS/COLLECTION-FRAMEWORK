package Module3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //yaha se array wala part
        int[] arr = {5,1,7,2,8,4};
        Arrays.sort(arr);
        for (int a: arr) {
            System.out.print(a + " " );
        }























        //List<Student> students = new ArrayList<>();
        //custom class ke lie humne comparable interface implement hi ni kia to pehle wahi karenge (humne Student m implement kia or tabhi collection.sort chal jayega)..
//        students.add(new Student(19, "vipul", 60));
//        students.add(new Student(23, "Love", 87));
//        students.add(new Student(23, "Ankit", 55));
//        students.add(new Student(7,  "Aryan", 13));
//        System.out.println(students);

      // Collections.sort(students, new Comparator<Student>() {
//           @Override
//           public int compare(Student o1, Student o2) {
//               return o1.weight - o2.weight;
//           }
//       });mein chahta to aise direct comporator bana ke bhi likh sakta tha lekin aise comporator banane par mujhe yeh kahi bhi use case mein aa skta hai
        //iske aur bhi method hote hai --> lambda expression jo kehta hai ki uper ke sare expression ko ek hi line mein likh lo
       // Collections.sort(students,(o1,o2) -> o1.weight - o2.weight); issi tarah se .....
//
//        Collections.sort(students,new weightComparator());
//        System.out.println(students);
        // yeh issue isliye aarha hai kyunki humne koi comparable interface define nahi ki hai , for eg;- by default agar maine String ya integer di hoti to woh sort ho jati lekin agar koi bhi collection ko sort karna hai to pehle usko comparable interface implement karna  padega


        //comparing
        //theComparing


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

