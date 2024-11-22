package test;
public class saving extends oop {

	public saving(String N, String B) {
		super(N, B);
		// TODO Auto-generated constructor stub
	}

	@Override
	void powerOn() {
		System.out.println("hello bro");
		
	}

	@Override
	void powerOff() {
		System.out.println("bye bro");
		
	}
	@Override
	void displayDetails() {
		System.out.println("the name of the device is :"+name+"the brand is :"+brand);
	}
	
}

