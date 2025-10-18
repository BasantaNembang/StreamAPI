package Practice;

//Grouping by Collect

import java.util.*;
import java.util.stream.Collectors;

//Input ["cat", "dog", "apple", "Nepal", "Everest", "Nembang"]
//Output 3: ["cat", "dog"]
//    5: ["Nepal", "apple"]
//    3: ["cat", "dog"]
//    7: ["Everest", "Nembang"]

public class Demo2 {

    public static void main(String[] args) {

        List<String> val = Arrays.asList("cat", "dog", "apple", "Nepal", "Everest", "Nembang");
        Map<Integer, List<String>> rls =  val.stream().collect(Collectors.groupingBy(g->g.length()));
        rls.forEach((e,i)->
        System.out.println(e+ " : "+i));
    }

}
