package example.instanceofTest.example2;

/*
 * Java �� instanceof �B��l (instanceof operator) �A���լY�@����O�_���t�@���O (class) ���l���O (subclass) �A�άO�Y���� (interface) ����@�����A�p�U�C��
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
