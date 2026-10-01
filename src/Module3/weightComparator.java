package Module3;

import java.util.Comparator;

public class weightComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //return o1.weight - o2.weight;
        //ab dekho isme bhi ek trick hai yeh java mein pehle se hi define hai ki , jo bhi cheez pehle se hi present ho unke compareTo methods already implements hai..
        return Integer.compare(o1.weight, o2.weight);//iske dwara bhi run kar sakte hai hum isko also word as difference shown above
    }
}
