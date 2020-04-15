package streamexamples;


import java.util.*;  
import java.util.stream.Collectors;  
  
class Productwo{  
    int id;  
    String name;  
    float price;  
      
    public Productwo(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class MethodReferenceExample {
	
    public static void main(String[] args) {  
          
        List<Productwo> productsList = new ArrayList<Productwo>();  
          
        //Adding Products  
        productsList.add(new Productwo(1,"HP Laptop",25000f));  
        productsList.add(new Productwo(2,"Dell Laptop",30000f));  
        productsList.add(new Productwo(3,"Lenevo Laptop",28000f));  
        productsList.add(new Productwo(4,"Sony Laptop",28000f));  
        productsList.add(new Productwo(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Productwo::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
    }  
}  

