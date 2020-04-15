package streamexamples;

import java.util.*;  

public class MinMaxExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25f));  
        productsList.add(new Product(2,"Dell Laptop",30f));  
        productsList.add(new Product(3,"Lenevo Laptop",28f));  
        productsList.add(new Product(4,"Sony Laptop",28f));  
        productsList.add(new Product(5,"Apple Laptop",90f));  
        // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println("1 : "+productA.price);  
        
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        
        System.out.println("2 : "+productB.price);  
        
     // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30)  
                    .count();  
        System.out.println("count : "+count);  
    }  
}
