package streamexamples;


import java.util.*;  
import java.util.stream.Collectors;  
  
  
public class MethodReferenceExampleTwo {
	
    public static void main(String[] args) {  
          
        List<Productwo> productsList = new ArrayList<Productwo>();  
          
        //Adding Products  
        productsList.add(new Productwo(1,"HP Laptop",25000f));  
        productsList.add(new Productwo(2,"Dell Laptop",30000f));  
        productsList.add(new Productwo(3,"Lenevo Laptop",28000f));  
        productsList.add(new Productwo(4,"Sony Laptop",28000f));  
        productsList.add(new Productwo(5,"Apple Laptop",90000f));  
          
       productsList.forEach(System.out::println);
       
       
       List<String> gamesList = new ArrayList<String>();  
       gamesList.add("Football");  
       gamesList.add("Cricket");  
       gamesList.add("Chess");  
       gamesList.add("Hocky");  
       System.out.println("------------Iterating by passing lambda expression---------------");  
       gamesList.stream().forEachOrdered(games -> System.out.println(games));  
       System.out.println("------------Iterating by passing method reference---------------");  
       gamesList.stream().forEachOrdered(System.out::println);  
       
    }  
}  

