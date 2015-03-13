package example.instanceofTest.example3;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
	public static void main(String args[]){
		Object object = new ArrayList();
		displayObjectClass(object);
	}
	
	public static void displayObjectClass(Object o){
		if(o instanceof Vector){
			System.out.println("Object was an instance of the class java.util.Vector");
		}else if(o instanceof ArrayList){
			System.out.println("Object was an instance of the class java.util.ArrayList");
		}else if(o instanceof String){
			System.out.println("Object was an instance of the class java.lang.String");
		}else{
			System.out.println("Object was an instance of the " + o.getClass());
		}
	}
}
