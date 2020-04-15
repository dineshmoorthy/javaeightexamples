package streamexamples;

interface SayableTwo{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
} 

public class DefaultMethodExampleTwo implements SayableTwo{  
	public void say(String msg){        // both are same method but no error   
        System.out.println("public method : "+msg);  
    }
	
	public void sayMore(String msg){        // implementing abstract method   
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	DefaultMethodExampleTwo dm = new DefaultMethodExampleTwo();  
        dm.say();   // calling default method  
        dm.sayMore("Work is worship");  // calling abstract method  
  
    }  
}  

