package Module2;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);//comparator add karna padega agar minHeap ka ulta chaiye to , wo bhi priorityQueue wale functions main isse yeh maxHeap m convert ho jata hai
        //maxHeap -> Integers -> high value -> high priority
        //default behaviour -> Integers -> less value -> high priority -> minHeap
        //ab ek dhyaan dene wali baat or ayi ki yeh to specifically integers ke case m apply ho rha hai bina integers ke case mein max kisko amanu min kisko manu , ab mere custom object hai to kya karu  mein ?
        //pq-> Strings -> comparator
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
