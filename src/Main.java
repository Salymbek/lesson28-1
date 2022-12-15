import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {



        Integer[] integers1 = new Integer[]{2,4,3,1,6,5,9,8,7,10,13,11,12,15,14};

        List<Integer>integers = new ArrayList<>();



        for (int i = 0; i < integers1.length ; i++) {
            if (integers1[i] % 2 == 1){
                integers.add(integers1[i]);
            }
        }


        for (Integer in2 : integers) {
            System.out.print("["+in2+"]   -   ");
            Stream.of(in2).forEach(x -> System.out.println(x * x));
        }



       Optional<Integer> max = integers.stream().max(Comparator.comparing(integer -> integer));
        System.out.println(max);


    }
}