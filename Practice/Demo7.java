package Practice;

import java.util.*;
import java.util.stream.Collectors;

//find the most repeated number in a list
//input::  [1,3,4,5,6,2,1,3,3]
//output:: 3 ->3
public class Demo7 {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 3, 4, 5, 6, 2, 1, 3, 3);

        Map<Integer, Long> result = values
                .stream()
                .collect(Collectors.groupingBy(
                        g -> g,
                        Collectors.counting()
                ));

        //values is the method of Map -> to get the value of Map
        Long highestValue = result
                .values()
                .stream()
                .max(Long::compare)
                .get();

        List<Integer> val = result
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == highestValue).map(m -> m.getKey()) //filtering and transforming the key
                .collect(Collectors.toList());

        System.out.println("Most repeated value is  " + val + " with the " + highestValue + " times");

    }

}
