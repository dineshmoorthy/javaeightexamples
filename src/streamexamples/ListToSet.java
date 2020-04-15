package streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ListToSet {
	    public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25f));  
	        productsList.add(new Product(2,"Dell Laptop",30f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28f));  
	        productsList.add(new Product(4,"Sony Laptop",28f));  
	        productsList.add(new Product(5,"Apple Laptop",90f));  
	        
	        productsList.add(new Product(6,"Dell Laptop",30f)); 
	        
	        // filter and convert into set
	        Set<Float> productPriceList =   
	            productsList.stream()  
	            .filter(product->product.price < 30)   // filter product on the base of price  
	            .map(product->product.price)  
	            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
	        System.out.println(productPriceList);  
	        
	     // Converting product List into Set  
	        Set<Product> setproduct = productsList
	        		.stream()
	        		.collect(Collectors.toSet());
	        System.out.println("setconversion : "+setproduct);
	        
	        // less than 31
	       // only once 30 is added in set while conversion
	        Set<Float> productPriceList2 =   
		            productsList.stream()  
		            .filter(product->product.price < 31)   // filter product on the base of price  
		            .map(product->product.price)  
		            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
		        System.out.println(productPriceList2);  
	        
	    }  
}