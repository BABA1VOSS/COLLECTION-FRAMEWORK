package Module1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List or Collection -> interface
        // ArrayList-> concrete class(kyunki yeh ek concrete class hai ,to  iska object banana assan hai)
        ArrayList<Integer>  list = new ArrayList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        //Remove
        list.remove(0);
        System.out.println(list);


        //addAll
        List<Integer> list2 =new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list2.size());


        System.out.println("printing list 2:" + list2);
        list2.clear();
        System.out.println(list2.size());

        // Iterator ek standardd way hai jiske dwara mein kisi bhi java ke framework collection ke uper traverse kar sakta hu

        // i want to traverse list using iterator-..
        Iterator<Integer> iterator = list.iterator();
        //Iterator ke pas ek special method hota hai uska naam hai --> hasnext()
        while(iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

// Yeh or tareeke hai list create karne ke >>.
  List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(2));
        System.out.println("before set: " + list3);
//


        list3.set(0,100);//(pehle index likhenge , fir value)(0,100)
        System.out.println("after : " + list3);

        //toArray --> koi bhi collection ko agar array mein convert karna ho to iska use karte hai
        Object[] arr = list3.toArray();
        for (Object obj: arr){
            System.out.println(obj);
        }

        //contains method
        System.out.println(list3.contains(1000));

       list.add(12);
       list.add(6);
        System.out.println("Printing Entire List: " + list);

        //sort an array list

        Collections.sort(list);
        System.out.println(list);
        //HW --> How we can sort in descending order
//        list.sort(Collections.reverseOrder());// hume jab descending order mein chaiye hoga tab hum list.sort likh ke fir (Collections.reverseorder kar denge matlab ki sortedd list ka reverse order kar denge
        Collections.reverse(list);// yeh second method hai isko theek karne ka
        System.out.println(list);

        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        //Isme humne kia yeh hai ki jese new list to bana li ab list.clone bhi kar dia lekin isse yeh chala ni to humne yeh wapis likh ke usko typecast kia hai...





    }
}
