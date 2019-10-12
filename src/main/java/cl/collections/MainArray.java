package cl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainArray {


    public static void main(String[] args) {

        //testArray();
        testList();





    }

    public static void testList() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(25);
        list.add(10);
        list.add(5);
        list.add(2);

        Collections.sort(list, new IntegerComparator());





        System.out.println("size: " + list.size());
        for(Integer item : list) {
            System.out.println(item);
        }
    }

    public static void testArray() {
        Integer[] array = new Integer[4];
        System.out.println("length array: " + array.length);
        for(Integer item : array) {
            System.out.println(item);
        }
    }

}
