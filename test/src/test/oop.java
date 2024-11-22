

//							   ****** object oriented programming ******


// // ***  principles of ooP:

// objects and classes

//       						* take the example of a bank and a bank account


//class -it's like a blueprint of the data like account number, user details and the actions that the user can do
//object - it is the actual account created

// A class cannot be accessed outside a package

/* encapsulation - specific actions and members can access your data and ensures data security

/* abstrastion - finding the complex details and showing only necessary details and hiding the complex details
                  it should show only essenntial features
ex - like the ATM shows withdraw,deposit and enquiry without showing the actual process happening*/

/* inheritence - it will allow us to create classes that have the common properties and behaviour as the existing obj 
ex - like the savings account and the current account from the bank account class*/

/*polymorphism - lets the objects do their task in their own way while doing the same task i.e. when we ask them to 
 				 perform a common task
 ex - in the claculation of interest savings account and current account can have different methods of calculating
 */


// // *** access modifiers

//default - default access modifier is also called package-private, which means that all members are visible within the same package, but aren’t accessible from other packages
//public - it can be accessable inside the class,outside the class ,inside the package and outside the package 
//protected - The protected keyword provide access of functions and variables to a the classes within the same package and its derived classes from different package
//private - This class can be accessed only in the class it is in and can't be accesseed outside it's class

// class ex -  

/*
package test;
public class oop {
	//attrinbutes 
	int Number;           					// Number and Balance are instance variables because they are associated with objects 
	double Balance;
			
	
	//methods
	
     void deposit(double amount) {
		if (amount>0) {
		  Balance += amount; 
		  System.out.println("successfullyy deposited "+amount+"in your account.Thank you");
			}
		else {System.out.println("error");
		};
	}
	
     void withdrawal(double amount) {
		if (amount>0) {
			if (amount<=Balance) {
				Balance-=amount;
				System.out.println("amount withdarawal successful");
			}
		}
	}
	
     void check() {
		System.out.println("Balance: "+Balance);
	}
}/*


//object ex - 

/*
package test;

public class bank_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		oop ba1 = new oop(101,5000); -->when there is a constructor
		//ba1.Number = 101;      --> when there is no constructor
		//ba1.Balance = 1200.09; --> when there is no constructor 
		ba1.check();
		ba1.deposit(1456732.79);
		ba1.withdrawal(567);
		ba1.check();
		}
	

}*/



// constructors 
/*
package test;
public class oop {
	//attrinbutes 
	int Number;           					// Number and Balance are instance variables because they are associated with objects 
	double Balance;
	
	// * contructor -
	 
	public oop(int N , double B) {
		this.Number = N;
		this.Balance = B;
	}
	// we can add methods further
	
}*/



// // *** Getters and Setters for instance variables -


// * these two are usually used for private variables because they are not meant to changed or modifies by the user


// Getter is used to get the value within the private variable .

// Setter is used to set the value within the variable.It ensures the value is non-negative,if given it becomes 0 

/* These are primarily used for protected and private type modifiers sometimes there 
   may be no need for getters and setters in protected. we can access the getters and 
   setters of a private class from any class in any package if the getter's and setter's
   modifiers is public and protected if the class is derived from the class it is in
   
 */




//class
/*
package test ;
public class oop{
	private long Number ;
	private double Balance;	
	public oop(long N,double B) {
		this.Number = N;
		this.Balance = B;
	}
    long get() {
		return Number;
	}
      void set(long number) {
		this.Number = number;
	}
	
	double getb(){
	return Balance;
	}
}*/

/*//object
package test;
public class bank_account{
	public static void main(String[] args) {
		oop account_1 = new oop(1021,7800);
		account_1.set(123456789);
		System.out.println(account_1.get()+"is the new account number");
		System.out.println(account_1.getb()+"is the balance");
	}
}*/


// //   *** static members 

// static members belong to the whole class and not only the object like instance members

/*//class

package test;
public class oop{
	private String name;
	private int age;
	public static int total = 0;
	
	public oop(String N ,int A) {
		this.name = N ;
		this.age = A;
		total++;
		}
	 void details() {
	     System.out.println("the age of the student "+name+" is "+age);
	     
	
	}
	 static void cla() {
		System.out.println("The total number of students in the class are : "+total);
	}

}*/

/*
// object 
package test;
public class bank_account{
	public static void main(String[] args) {
		oop st1 = new oop("Hemaraj",18);
		oop st2 = new oop("kaya",18);
		st1.details();
		st2.details();
		oop.cla();    		// static method should be called with the class it is in
	}
}*/

/*
package test;
public class oop{
	static int x = 5;
	static {
		x+=10; // this static block runs during the execution
	}
	public static void main(String[] args) {
		System.out.println("the value of x is : "+ x);
	}
}
*/
// ex - 1
/*//class
 
package test;
public class oop{
	 String name;
	 int age;
	 
	 public oop (String N,int A) {
		 this.name = N;
		 this.age = A;
		 }
		 
		 
	 void printdetails() {
		 System.out.println("The name of the person is "+name+" and the age is "+age);
	 }
}
*/
/*//object 

package test;
public class bank_account{
	public static void main(String[] args) {
		oop ba1 = new oop("hemaraj",18);
		ba1.printdetails();
	}
}


// ex - 2
/*class*/
/*
package test;
public class oop{
	int a ;
	int b ;
	
	static private int result = 0;
	
	public oop(int a , int b) {
		this.a = a;
		this.b = b;
	};
	
	static void  add(int a, int b) {
		int  c = a+b;
		result += c;
		
	}
		
	
	static void  sub (int a, int b) {
		 int c = a-b;
		result += c;
	}
	
	static int getresult() {
		return result;
	}
}
*/

//object
/*
package test;
public class bank_account{
	public static void main(String[] args) {
		oop.sub(2,3);
		oop.getresult();
		System.out.println(oop.getresult());
		
	}
	
}
*/

// // *** Inheritance (super class and sub-class)

// super class stays the same in inheritance the sub-class inherits or take the properties of the super class

// defining a sub-class: in the class section we should add the keyword "extends" after the inheritable class
// sub-class cannot access the private members of the parent class

//super class
/*
package test;
public class oop{
	int a ;
	int b ;
	
	static private int result = 0;
	
	public oop(int a , int b) {
		this.a = a;
		this.b = b;
	};
	
	static void  add(int a, int b) {
		int  c = a+b;
		result += c;
		
	}
		
	
	static void  sub (int a, int b) {
		 int c = a-b;
		result += c;
	}
	
	static int getresult() {
		return result;
	}
}
*/

// sub-class 



/*
package test;
public class bank_account extends oop{
	int div;
	public bank_account(int a,int b,int c) {
		super(a,b);
		this.div = c;
	}
    void calr() {
    	System.out.println(a*b*b+a+2*b);
    }
}
*/

//object of the sub-class

/*
package test;

public class application {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		bank_account n1 = new bank_account(12,23,12);
		n1.calr();
	}

}
*/


// //*** Types of inheritances


// *  single inheritance - in the above example is a single type inheritance

// *  multilevel inheritance - this is like step inheritance 
//                          ex - super class --> sub-class1 --> sub-class2

// *  hierarchial inheritance - two or more sub-classes inherit from a single super class

// *  hybrid inheritance - it includes different types of inheritances within the same class we can use all inheritances above in this to make a complex program

// *  multiple inheritance - it is not possible in java but a scenario like multiple inheritance,is possible with the help of interface 


// multilevel inheritance ex -


// class
/*
package test;
public class oop{
	void dl() {
		System.out.println("used to draw line");
	}
}
 class oop1 extends oop{
	void dc() {
		System.out.println("used to draw a circle");
	}
}
 class oop2 extends oop1{
	void dcc() {
		System.out.println("used to draw colored circle");
	}
}
*/


//object
/*
 package test;
 public class bank_account {
 	public static void main(String[] args) {
 		oop2 o = new oop2();
 	    o.dl();
 		o.dc();
 		o.dcc();
 	}
 }
*/


//hierarchial inheritance ex -



// class
/*
package test;

public class vehicle {
     void start () {
    	 System.out.println("the vehicle is starting :");
     }
}
class car extends vehicle{
	void startc() {
		System.out.println("rmmmmm");
	}
}

class bike extends vehicle{
	void startb() {
		System.out.println("vuiii");
	}
}
*/


// object 
/*
package test;
public class application{
	public static void main(String[] args) {
		car C = new car();
		bike B = new bike();
		B.start();
		B.startb();
		C.start();
		C.startc();
		
	}
}
*/



// over ride - 

// There is no need for this to add when the signatures are same (method name and parameter type are same)

// class - 
/*
package test;
public class vehicle {
     void start() {
    	 System.out.println("the vehicle is starting :");
     }
}
class car extends vehicle{
	
	void start() {
		System.out.println("rmmmmm");
	}
}

class bike extends vehicle{
	@Override
	void start() {
		System.out.println("vuiii");
	}
*/

// object - 
/*
package test;
public class application{
	public static void main(String[] args) {
		vehicle C = new car();
		vehicle B = new bike();
		B.start();
		
		C.start();
		
		
	}
}
*/
//super class 
/*
package test;

public class banking {
	    private int  acc_number;
		 double balance;
		 
	  
	public banking(int acc_number,double balance) {
		this.acc_number = acc_number;
		this.balance = balance;
	}
	
	double  getb() {
		return balance;
	}
	int getn() {
		return acc_number;
	}
	
	
	public void deposit(double amount) {
		System.out.println("the deposit was successful the amount deposited is "+amount+".the balance is "+balance);
	}
	public void interest(double interest_rate) {
		double interest = balance*interest_rate;
		System.out.println(interest+" is the interest");
	}
}
*/

// sub-class
/*
package test;

public class saving extends banking {

	public saving(int acc_number, double balance) {
		super(acc_number, balance);
	}
	@Override
		public void interest(double interest_rate) {
			double interest = balance*interest_rate;
			System.out.println(interest+" is the interest(saving class)");
	}
	
}
*/


// object 
/*
package test;
public class oop{
	public static void main(String[] args) {
	banking c1 = new saving(110,2300);
	c1.deposit(100);
	c1.interest(0.05);
}
}
*/



// // *** polymorphism



/* this is not applicable for static variables because they don't follow this mechanism but the static 
method can be redefined in the sub-class but this is not called method overriding but method hiding*/


//* dynamic method dispatch and run time polymorphism


/*There is no need to access this feature it takes the control automatically inorder to make the program 
more effiecient by letting the compiler know which method to use to different type of objects*/

//method behavior is determined based on the actual object during the runtime

// it is related to overriding which we add in the sub-class



//* method overloading and compile-time polymorphism

//The compile select the mothod which is suitable for the peration based on the arguments provided(type)

// class ex - 
/*
package test;
public class oop{
	int add(int a,int b) {
		return(a+b);
	}
     
	void add(int a ,float b) {
		System.out.println(a+b);
	}
	
	float add(float a ,float b) {
		return(a+b);
	}
}
*/

//object ex - 
/*
package test;
public class hello{
	public static void main(String[] args) {
		oop n = new oop();
		int result = n.add(1, 1);
				System.out.println(result);
		float result1 = n.add(1.1f,2.0f);		
		System.out.println(result1);
		n.add(1,2.01f);
	}


}*/


// class ex1 - polymorphism

/*
package test;
public class oop{
	
	static public class rectangle {
		 int area(int a ,int b) {
			return a*b;
			}
	     double area(double a,double b) {
	    	return a*b;
	    }
	    
		}
	static public class circle {
		 double area(int r) {
			return (3.14*r*r);
		}
	     double area(double r) {
	    	return(3.14*r*r);
	    }
	static public class triangle {
		 double area(int a , int b) { 
			
			double c = 0;
			if (a<=0||b<=0) {
				System.out.println("enter a new input");
			}
			else {
				c += (0.5*a*b);
			}
		return c;
		}
		 double area(double a, double b) {
			double c = 0;
			if (a<=0||b<=0) {
				System.out.println("enter a new input");
			}
			else {
				c += (0.5*a*b);
			}
		return c;
		}
	}
	
	
	}
	}
*/	 

// method - 
/*
package test;
public class hello{
	public static void main(String[] args) {
		oop.rectangle s1 = new oop.rectangle();
		oop.circle s2 = new oop.circle();
	   
		System.out.println(s1.area(12,5));
		System.out.println(s2.area(5));
		
	}
}
*/


//class ex 2 - 
/*
package test;
public class oop {

    public static class Rectangle {
        public int area(int a, int b) {
            return a * b;
        }

        public double area(double a, double b) {
            return a * b;
        }
    }

    public static class Circle {
        public double area(int r) {
            return Math.PI * r * r;
        }

        public double area(double r) {
            return Math.PI * r * r;
        }
    }

    public static class Triangle {
        public double area(int a, int b) {
            if (a <= 0 || b <= 0) {
                System.out.println("Enter valid positive inputs for base and height.");
                return 0;
            }
            return 0.5 * a * b;
        }

        public double area(double a, double b) {
            if (a <= 0 || b <= 0) {
                System.out.println("Enter valid positive inputs for base and height.");
                return 0;
            }
            return 0.5 * a * b;
        }
    }

}*/


// object - 
/*
package test;
public class hello{
    public static void main(String[] args) {
        // Create instances of the static nested classes
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        // Call area methods
        System.out.println("Area of rectangle: " + rectangle.area(5, 3));
        System.out.println("Area of circle: " + circle.area(4));
        System.out.println("Area of triangle: " + triangle.area(6, 4));
    }
}
*/


// // *** Abstraction



/*abstract class - this cannot be initialised on it's own or objects canot be created from a abstract class
  			       there no need for them have constructors because they cannot be accessed directly until
				   a sub-class is created and super() is used,that means that constructors in  abstract 
			       class come to play when a concrete class is created
*/

//abstract method - they should be declared in abstract class and should be specified in the concrete class


// abstract class ex -

//class(abstract)

/*
package test;
public abstract class oop{
    double Balance;
    int account_number;
	
	//constructors not needed for an abstract class
    public oop(int account_number,double balance) {
    	this.Balance = balance;
    	this.account_number = account_number;
    }
	
	void deposit(double amount) {
		Balance += amount;
		System.out.println("the amount has been successfuly deposited the new ,the new balance is :"+Balance);
		
		
	}
	void withdraw(double amount) {
		Balance -= amount;
		System.out.println("the amount has been successfuly withdrawed the new ,the new balance is :"+Balance);
	}
	
	void check() {
		System.out.println("the current balance of the account is :"+Balance);
		
	}

	abstract void interest(double interest_rate);
		

	

}
*/


// concrete class 

/*
package test;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class hello{
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("hello there");
		Matcher matcher = pattern.matcher("hello there");
		while (matcher.find()) {
			System.out.println(1);
		}
	}
}
*/
/*
package test;
public class hello extends oop{
    private double interest_rate;
	public hello(double Balance,int account_number,double interest_rate ) {
	    super(account_number, Balance);
		this.interest_rate = interest_rate;
	}
	@Override
	void interest(double interest_rate) {
		double interest = interest_rate*Balance;
		System.out.println("the interest :"+interest);
		Balance +=interest;
		System.out.println("the new balance is :"+Balance);
	}
		
	
	
}
*/

// object 

/*
package test;
public class application{
	public static void main(String[] args) 
	{oop object = new hello(2000,10012,0.05);
	object.interest(.05);
	object.withdraw(1908);
	object.deposit(123923);
	object.interest(0.08);
}
}
*/ 



// // *** interfaces


//inerface defines a contract method between the class implementing the interface must provide
//it plays a very important role in java providing a way to use multiple inheritance
//objects cannot be created for this the implemented class onject can be created 
//it contains of abstract methods 
//methods cannot be initialised in a interface so a default keyword is used before the methods , using default keyword we can change the method after inheriting it to the class 
//static method can also be initialised but cannot be changed after once initiated
//it helps in abstraction by showing only the interface of the object
//interfaces can extend multiple interface and not multiple classes
//interfaces should always be public 


//interface - 

/*
package test;
public interface oop{
	void start();
	void stop();
	
	default void honk() {
		System.out.println("the system is honking");
		
	}
	static void drift() {
		System.out.println("the vehicle is drifting");
	}
}
*/

//implemented class - 

/*
package test;
public class application implements oop{

	@Override
	public void start() {
		System.out.println("the vehicle is starting");
		
		
	}

	@Override
	public void stop() {
		System.out.println("the vehicle stopped");
		
	}
	
}
*/

// object created for the implemented class - 

/*
package test;

public class vehicle1 {

	public static void main(String[] args) {
	application car = new application();
	car.start();
	car.stop();
    oop.drift();
    car.honk();
	}

}*/

//abstract class- 
/*
package test;
public abstract class oop{
	protected String name;
	protected String brand;
	
	public oop(String N,String B) {
		this.name = N;
		this.brand = B;
	}
	
	abstract void powerOn();
	abstract void powerOff();

	abstract void displayDetails();
	
	
}
*/


//concrete classes - 

//concrete class 1 - 

/*package test;
public class hello extends oop {

	public hello(String N, String B) {
		super(N, B);
		// TODO Auto-generated constructor stub
	}

	@Override
	void powerOn() {
		System.out.println("the device is starting");
		
	}

	@Override
	void powerOff() {
		System.out.println("goodbye");
		
	}
	@Override 
	void displayDetails() {
		System.out.println("the name of the device is :"+name+"the brand is :"+brand);
	}
	
	
	
}*/

//concrete class 2 -  

/*package test;
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
*/


// object of the concrete classes -

/*
package test;
public class application{
	public static void main(String[] args) {
oop smartPhone = new hello("s24","samsung");
smartPhone.powerOn();
smartPhone.powerOff();
smartPhone.displayDetails();

oop laptop = new saving("mac 2 pro","apple");
laptop.powerOn();
laptop.powerOff();
laptop.displayDetails();


}}*/
 


//ex -

// interface 1 -
/*
package test;
public interface oop{
	
	void draw();
	
}*/

//interface 2 -

/*
package test;

public interface resizable {
 void resize(int length,int width);
}
*/

// impleted class inheriting both the interfaces -

/*
 package test;

public class rectangle implements oop,resizable
 {private int  length;
  private int width;
public rectangle(int L,int W) {
	int age , float height , float weight)this.length = L;
	this.width  = W;
}
	@Override
	public void draw() {
		System.out.println("drawing a recangle .the length is "+length+" and the width is "+width);
	}

	@Override
	public void resize(int l, int w) {
		this.length = l;
		this.width = w;
		System.out.println("the new length is "+l+" and the new width is "+w);
		
	}

}


// object of the implemented class
 
 package test;
public class application{
	public static void main(String[] args) {
		rectangle r = new rectangle(12,5);
		r.draw();
		r.resize(13,4);
		r.draw();
	}
}
 */


 


