package example.instanceofTest.example2;

/*
 * Java 的 instanceof 運算子 (instanceof operator) ，測試某一物件是否為另一類別 (class) 的子類別 (subclass) ，或是某介面 (interface) 的實作介面，如下列表
 */
public class InstanceOfDemo {
	public static void main(String args[]){
		InstanceOfDemo demo = new InstanceOfDemo();
		
		if(demo instanceof Object){
			System.out.println("instanceofDemo is an instance of Object.");
		}else{
			System.out.println("instanceofDemo is not an instance of Object.");
		}
	}
}
