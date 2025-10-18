package Practice;



import java.util.Arrays;
import java.util.List;

// WAP to print the list of number staring with 1
// i.e given [1,3,4,15] =  1, 15 

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> val =  Arrays.asList(1, 5,8, 12, 66, 101, 88);
        val.stream().map(e->e+" ").filter(e->e.startsWith("1")).forEach(p->
        System.out.println(p));
    }
}
