package streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class ReduceSumExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25f));  
        productsList.add(new Product(2,"Dell Laptop",30f));  
        productsList.add(new Product(3,"Lenevo Laptop",28f));  
        productsList.add(new Product(4,"Sony Laptop",28f));  
        productsList.add(new Product(5,"Apple Laptop",90f));  
        // This is more compact approach for filtering data  
        
        Float totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        
        System.out.println("1 : "+totalPrice);
        
        // More precise code   
        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        
        System.out.println("Float sum : "+totalPrice2);  
          
        double totalPrice3 = productsList.stream()  
                .collect(Collectors.summingDouble(product->product.price));  
        System.out.println("Collectors collect : "+totalPrice3);  

    }  
}  
