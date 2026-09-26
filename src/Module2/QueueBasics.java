package Module2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
   public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       //--ADDITION
//       q.add(10);
//       q.add(20);
//       q.add(30);


     // offer() mein bhi add hi kar rhe hote hai and addition meini bhi add hi kar rhe hote hai difference yeh hai ki addition mein agar condition successful ni  hoti hai to exception throw kar deta hai and offer FALSE retrun kar deta hai agar condition successsful ni hoti hai to
       // jab m DSA solution karta hu to meri koshish rehti hai ki hum exception throw na kr ke true false main answer lele. isliye hum offer ka use mostly kare mostly add mein


       //--OFFER--
       q.offer(10);
       q.offer(20);
       q.offer(30);
       System.out.println(q);


//       System.out.println(q.element());
       //ab same kahani isme bhi chlati hai element bhi head of the queue batata hai or exception bhi thorow kar deta hai condition agar satisfy ni hui to
       // islie hum hamesha peek() ka istemaal karte hai taki yeh null return kare na ki exception khas kar DSA m and queue mein
       System.out.println(q.peek());

       //--REMOVE() and POLL()----
       //System.out.println(q.remove());
       //same kahani isme bhi hai
       //HUM REMOVE KA USE NI KARENGE EXCEPTION THROW KAR DEGA
       // hum POLL ka use karenge hamesha hi taki koi exception na aye
       System.out.println(q.poll());
       System.out.println("after removing : "+q);
     // yeh to ek normal queue hai normal queue ka natural behaviour hi hota hai ki starting mein hi removing and last mein hi insertion lekin lekin jaise hi main doubly ended queue deque ki bat karta hu isme mein last se bhi and starting se  bhi insertion and deletion kar skta hu

       Deque<Integer> k = new LinkedList<>();
       k.offer(10);
       k.offer(20);
       k.offer(30);
       System.out.println(k.getFirst());
       System.out.println(k);


   }
}
