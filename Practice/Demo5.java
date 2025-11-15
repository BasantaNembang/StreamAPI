package Practice;

//Find the sum of transaction amounts for each day and sort the date by order

import java.util.*;
import java.util.stream.Collectors;

class TranctionDTO {

    String date;
    int amount;

    TranctionDTO() {
    }

    TranctionDTO(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "TranctionDTO [date=" + date + ", amount=" + amount + "]";
    }
    

}




public class Demo5 {

    public static void main(String[] args) {

      List<TranctionDTO> dTOs =  Arrays.asList(new TranctionDTO("11-14-2025", 499),
                        new TranctionDTO("11-13-2025", 699),
                        new TranctionDTO("11-14-2025", 499),
                        new TranctionDTO("11-15-2025", 199),
                        new TranctionDTO("11-11-2025", 99),
                        new TranctionDTO("11-14-2025", 799),
                        new TranctionDTO("11-15-2025",699),        
                        new TranctionDTO("11-13-2025", 499));

                  
                        //group according to date and adding the amount
                        Map<String, Integer> response =  dTOs.stream().collect(Collectors.groupingBy(
                                         TranctionDTO::getDate,
                                         Collectors.summingInt(TranctionDTO::getAmount)
                                         ));

                         //now filtering according to date
                         
                         response
                         .entrySet()
                         .stream()
                         .sorted(Map.Entry.comparingByKey())
                         .forEach(e->{
                            System.out.println(e.getKey()+ " "+e.getValue());
                         });
                         


    }

}
