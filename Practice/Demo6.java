package Practice;

//Input:: Java1212
//output:: 4

public class Demo6 {

    public static void main(String[] args) {
        String data = "Java1212";

        Integer totalNum = (int) data
                .chars()
                .filter(Character::isDigit)
                .count();

                System.out.println(totalNum);


    }

}
