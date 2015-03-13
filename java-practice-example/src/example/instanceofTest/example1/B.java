package example.instanceofTest.example1;

public class B implements A {
	public static void main(String args[]){
		A a = null;
		B b = null;
		
		if(a instanceof A){
			System.out.println("true 1");
		}else{
			System.out.println("false 1");
		}
		
		if(b instanceof B){
			System.out.println("true 2");
		}else{
			System.out.println("false 2");
		}
	
		a = new B();
		
		if(a instanceof A){
			System.out.println("true 3");
		}else{
			System.out.println("false 3");
		}
		
		if(a instanceof B){
			System.out.println("true 4");
		}else{
			System.out.println("false 4");
		}
	
		b = new B();
		if(b instanceof A){
			System.out.println("true 5");
		}else{
			System.out.println("false 5");
		}
		
		if(b instanceof B){
			System.out.println("true 6");
		}else{
			System.out.println("false 6");
		}
	}
}
