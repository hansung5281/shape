package ex3;

public class Student extends Person{

	public Student(){
		tell();
	}
	@Override
	public void tell() {
		System.out.println("����� ���ϴ�.");
	}
	
	public void calculation(int x,int y){
		System.out.println(x+y);
	}
	public void calculation(double x,double y){
		System.out.println(x+y);
	}
	
}
