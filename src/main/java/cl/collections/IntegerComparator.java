package cl.collections;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //o1 = 1
        //o2 = 2
        // 1 - 2 = -1

        if(isOdd(o1) && isOdd(o2)) {
            return o1-o2;
        } else if(isOdd(o1)) {
            return -1;
        } else if(isOdd(o2)) {
            return 1;
        }
        return o1-o2;
    }


    private boolean isOdd(Integer value) {
        return (value % 2 == 1);
    }
}
