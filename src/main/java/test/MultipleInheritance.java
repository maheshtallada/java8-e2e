package test;

public class MultipleInheritance implements IntA, IntB {
	
	// try having the same method in two interfaces with diff return types.\
	// which is not possible.

	public static void main(String[] args) {
		//new MultipleInheritance().m1();
	}
	@Override
	public void m1() {
		System.out.println("na java na istam");
	}
	@Override
	public void m1(int m1) {
		// TODO Auto-generated method stub
		
	}
}

interface IntA {
	public void m1(int m1);
	//public String m1();
}

interface IntB {
	public void m1();
}