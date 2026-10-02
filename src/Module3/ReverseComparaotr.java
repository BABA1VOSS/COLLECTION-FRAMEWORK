package Module3;

import java.util.Comparator;

public class ReverseComparaotr implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0 - Integer.compare(o1, o2);
        // isme mene condition di hai ki, positive integer changes to negative and negative integer changes to positive yeh 0 se minus karne pe ho jayega!
        // second method main usko -1 se multiply kar ke bhi return karva sakta hu


    }
}
