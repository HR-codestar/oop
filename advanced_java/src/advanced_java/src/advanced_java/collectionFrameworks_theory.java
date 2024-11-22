

// // *** Collection Frameworks in java


/*
  
Iterators - act like a way to go through our collection,one item at a time
consistancy - we can use simlar type of methods to work with different collections
flexibility - we can easily switch from one collection to another collection

types of collections :

			
									
								***	list interface -


there will order in the elements getting stored

they are dynamically sized 

implementations - array list and linked list



 									Array list - 



Array list is a collection
we have to import this feature from the java util package 
syntax used to call the function - ArrayList<class> listName = new ArrayList<>();


ex - 


the class which specifies the type of things in the object class - 
 
package test;
public class bank_account{
	private String name;
	private int price;
	
	public bank_account(String s,int p) {
		this.name = s;
		this.price = p;
	}

	String get() {
		return name;
	}
	
	int getp() {
		return price;
	}
	
	@Override
	public String toString() {
		return "the name of the person is "+name+" the price of the item bought is "+price;
		
	}

}


main class - 

package test;
import java.util.ArrayList;
public class application{
	public static void main(String[] args) {
		ArrayList<bank_account>price = new ArrayList<>();
		
		price.add(new bank_account("hemaraj",1200));
		price.add(new bank_account("kaya",1500));
		price.add(new bank_account("raj",2200));
		
		price.remove(2);
		
		for(bank_account i : price )// <-- enhanced for loop 
		{
			System.out.println(i);
		}
		
	}
}


Access elements with index -


use the following syntax to access an element in an array list 

(class of the object type) some variable = listName.get(index)

now the details will be stored in the variable and can be printed out



										linked list - 



these are the same as array list but the elements in it are linked to each other the elements in it follow a sequnce
the connection will be adjusted if an element in middle is removed 

a -> b -> c -> d

if remove b from this,the links become

a -> c -> d


we should use a function removeFirst() to remove the first element


main class - 


package test;
import java.util.linkedList;
public class application{
	public static void main(String[] args) {
		linkedList<bank_account>price = new linkedList<>();
		
		price.add(new bank_account("hemaraj",1200));
		price.add(new bank_account("kaya",1500));
		price.add(new bank_account("raj",2200));
		
		price.remove(2);
		
		for(bank_account i : price )// <-- enhanced for loop 
		{
			System.out.println(i);
		}
		
	}
}



								***	set interface -
									

there will be no order in the elements getting stored

doesn't store any duplicate elements



									hashset - 

get() cannot be used								
									
it doesn't follow any order 
there no need for a class that defines the behaviour of the object
																	
ex 1 - 

package test;
import java.util.HashSet;

public class application{
	public static void main(String[] args) {
		HashSet<String> prices = new HashSet<>();
		
		prices.add("hemaraj");
		prices.add("karaj");
		prices.add("kdraj");
		
		for(String i : prices ) {
			System.out.println(i);
		}
	}
}


ex 2 - 

package test;
import java.util.HashSet;
public class bank_account{
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("hemaraj");
		set.add("hema");
		set.add("varabhushan");
		
		for (String i : set) {
			System.out.println(i);
		}
		HashSet<Integer> setn = new HashSet<>();
		setn.add(1);
		setn.add(5);
		setn.remove(1);
		
		System.out.println();
		
		for(Integer i :setn) {  // <-- integer set
			System.out.println(i);
		}
		}
	


									
									treeSet - 
									
									
follow an order of alphabetical for string type and accending for numbers


ex - 

package test;
import java.util.TreeSet;
public class bank_account{
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("hemaraj");
		set.add("hema");
		set.add("varabhushan");
		
		for (String i : set) {
			System.out.println(i);
		}
		TreeSet<Integer> setn = new TreeSet<>();
		setn.add(1);
		setn.add(5);
	
		
		System.out.println();
		
		for(Integer i :setn) {  // <-- integer set
			System.out.println(i);
		}
		}
	
}



									***	map ineterface - 
									
									
					
A map is like a dictionary in python it has two types of values in it,the key and the value 



										  HashMap - 

entries will be in any order									
									
									
ex -


package test;
import java.util.HashMap;
public class bank_account{
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("hemaraj",157);
		map.put("farah",149);
		map.put("kaya",153);
		
		System.out.println(" Results :");
		System.out.println();
		for(HashMap.Entry<String,Integer> i :map.entrySet()) {
			System.out.println("the marks obtained by "+i.getKey()+" are: "+i.getValue());
		}
		
	}
}

ex 1 -

package test;
import java.util.HashMap;
public class bank_account{
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("hemaraj",157);
		map.put("farah",149);
		map.put("kaya",153);
		
		System.out.println(" Results :");
		System.out.println();
		for(HashMap.Entry<String,Integer> i :map.entrySet()) {
			System.out.println("the marks obtained by "+i.getKey()+" are: "+i.getValue());
			
			System.out.println("kaya has got "+ map.get("kaya"));
		}
		
	}
}



									treeMap - 
									
									

these maps arrnage the elements in an order based on the keys 
these are same as the hashmaps but they sort the elements in order is the only difference
it does not allow duplicate keys 


*** clear() deletes all the elements in the collection



									functional interface -
									
									
A functional interface can have only one abstract function but can have multiple default functions
it is also called single abstract method interface or SAM interface
we have to add the annotation @FunctionalInterface
the first function defined is by default an abstract method



									stream API (application programming interface) -

									
									
it is like a conveyor belt or acts like a it so that we can provide different implementations are use some
operations on the elements of a list interface or the object of a specific class									
									
ex - 

package test;


import java.util.Arrays;
import java.util.List;

public class bank_account{
	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(2,4,5,3,5,62,12);
	
	int sum_odd = numbers.stream().filter(n->n%2!=0).mapToInt(Integer :: intValue).sum();
	System.out.println(sum_odd);
	}
}									
									
									
								    date and time API - 
								    
								    
for date we should use localdate class and should be imported from the java.time.LocalDate	
for time we should use localtime class and should be imported from the java.time.LocalTime

package test;
import java.time.LocalDate;
import java.time.LocalTime;

public class bank_account{
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalTime now1 = LocalTime.now();
		System.out.println("date :"+now +" , time :"+ now1);
	}
}


									anonymous class - 

It is a nested class that doesn't have any name
It is used to add additional methods to the objects or any other sub-class
They enable you to declare and instantiate a class at the same time
They are like local classes except that they do not have a name
									
ex - 
									
package test;
public class bank_account{
	interface ano{
		public void star();
	}
	
	public static void main(String[] args) {
		ano obj = new ano() {

			@Override							// anonymous class
			public void star() {
				System.out.println("yoo");
				
			}
			
			
		};
		obj.star();
	}
}									 
									
									lambda expressions - 
									
A lambda expression is a short block of code which takes in parameters and returns a value
Lambda expressions are similar to methods 
They do not need a name and they can be implemented right in the body of a method								
this can be used only in a functional interface
lambda can be used to implement a functional interface without creating a class or an anonymous class 
Lambda expressions can be used only with interfaces that declare a single method									
			
							    
ex - 

package test;
public class bank_account{
	@FunctionalInterface
	interface ano{
		public void star();
	    default void star1() {
	    	System.out.println("hioo");
	    };
		
	}
	
	public static void main(String[] args) {
		ano obj = () ->{System.out.println("this is an object");};
		obj.star();
		obj.star1();
	}
}
							    
							    
							    	multithreading and concurrency -
						
							    	
							    	
It helps in achieving parallelism by doing specific task at a time by using multiple threads
we can achieve this with two methods they are by directly using the threads or by runnable interface
							    	
							    	
thread method - 

ex - 


thread class - 

package test;
public class bank_account extends Thread{
	@Override 
	public void run() {
		for (int i = 1 ; i<=5 ; i++) {
		System.out.println("thread :"+Thread.currentThread().getId()+" "+i);
	}
}
}

main class - 

package test;
public class application{
	public static void main(String[] args) {
		bank_account thread1 = new bank_account();
		bank_account thread2 = new bank_account();
		bank_account thread3 = new bank_account();
		
		thread1.start();
		thread2.start();
		thread3.start();

	}
}

runnable method - 

ex - 

runnable class -

package test;
public class bank_account implements Runnable{
	
	@Override
	public void run() {
		for (int i = 1 ; i<=5 ; i++) {
			System.out.println("yehhey :"+Thread.currentThread().getId()+" "+i);
		}
	}
}		
		
main class -

package test;
public class application{
	public static void main(String[] args) {
		bank_account run = new bank_account();
		Thread thread1 = new Thread(run);
		Thread thread2 = new Thread(run);
		
		thread1.start();
		thread2.start();
	}
}									


										synchronization -
										
										
class -

package test;
public class bank_account{
	
	double balance;
	
	public bank_account(double b ) {
		this.balance = b;
	}
	
	public synchronized void deposit(double amount){
		balance +=amount;
		System.out.println("amount deposit of "+amount+" successful and the current balance is :"+balance);
		
	}
	public synchronized void withdrawal(double amount) {
		balance -= amount;
		System.out.println("amount of "+amount+" is withdrawed the current balance is "+balance);
		
	}
	public synchronized void check() {
		System.out.println(balance);
	}
}

application class - 

package test;
public class application {
	public static void main(String[] args) {
	bank_account acc = new bank_account(10000);
	
	Thread depositThread = new Thread(() ->{acc.deposit(20000);});
	Thread withdrawT = new Thread(() ->{acc.withdrawal(2000);});
	Thread checkT = new Thread(() ->{acc.check();});
	
	
	depositThread.start();
	checkT.start();
	withdrawT.start();

	
									locks in threads - 

								
helps the threads in not running concurrently
								
ex -

package test;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class bank_account{
	
	double balance;
	private final Lock lock = new ReentrantLock();
	public bank_account(double b ) {
		this.balance = b;
	}
	
	public void deposit(double amount){
		lock.lock();
		try {
		balance +=amount;
		System.out.println("amount deposit of "+amount+" successful and the current balance is :"+balance);
		}
		finally {
			lock.unlock();
		}
	}
	public void withdrawal(double amount) {
		lock.lock();
		try {
		balance -= amount;
		System.out.println("amount of "+amount+" is withdrawed the current balance is "+balance);
		}
		finally {
			lock.unlock();
		}
	}
	public synchronized void check() {
		lock.lock();
		try {
		System.out.println(balance);}
		finally {
			lock.unlock();
		}
	}
}									
	
}
}

application class - 

package test;
public class application {
	public static void main(String[] args) {
	bank_account acc = new bank_account(10000);
	
	Thread depositThread = new Thread(() ->{acc.deposit(20000);});
	Thread withdrawT = new Thread(() ->{acc.withdrawal(2000);});
	Thread checkT = new Thread(() ->{acc.check();});
	
	
	depositThread.start();
	
	withdrawT.start();
	checkT.start();
	
	
	
}
}
										
										
										
									communication and coordination in threads - 
									
										
a communication and coordination is always required in multithreads case

there are two types of threads for this operation they are the producer threads and the consumer threads										
coo										

ex -

producer thread class - 
										
package test;

import java.util.LinkedList;
import java.util.Random;

public class bank_account implements Runnable{
private final LinkedList<Integer>b;

bank_account(LinkedList b){
	this.b = b;
	
}
@Override
public void run() {
	try {
	while(true){
		this.produce();
		
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	

}
	
public void produce() throws InterruptedException {
	synchronized (b) {
		while(b.size()==1) {
			System.out.println("the consumer is waiting");
			b.wait();
		}
		Random r = new Random();
		int num = r.nextInt(9);
		b.add(num);
		b.notifyAll();
		Thread.sleep(10);
	}
}
}										
										
consumer thread class - 

package test;

import java.util.LinkedList;

public class application implements Runnable {
    private final LinkedList<Integer> b;

    application(LinkedList<Integer> b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.consume();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void consume() throws InterruptedException {
        synchronized (b) {
            while (b.size() == 0) {
                System.out.println("consumer is waiting ");
                b.wait();
            }
            int num = b.remove(0);
            System.out.println("consumer consumed: " + num);
            b.notifyAll();
            Thread.sleep(10);
        }
    }
}										
										
main class - 

package test;

import java.util.LinkedList;

public class oop{
	public static void main(String[] args) {
LinkedList<Integer> b = new LinkedList<>();
        
        bank_account p = new bank_account(b);
        application c = new application(b);
        
		Thread pthread = new Thread(p);
		Thread cthread = new Thread(c);
		
		pthread.start();
		cthread.start();
	}
}
										
										
					
										
							
										
										
										
										
										
										
										
 */