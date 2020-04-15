package javascriptinjavaexamples;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashronExample {
	 public static void main(String[] args) throws Exception{  
	        // Creating script engine  
	        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
	        // Reading Nashorn file  
	        //ee.eval(new FileReader("js/hello.js"));  
	        ee.eval(new FileReader("hello.js"));
	    }  
}
