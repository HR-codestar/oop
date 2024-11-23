package mt;

public class Example {
	
	
	
	class booking extends Thread {
		Object train = null;
		Object comp = null;
		

	public booking(Object train, Object comp) {
		this.train = train;
	    this.comp = comp;
	}
	@Override
	public void run() {
		System.out.println(getName()+"booking start");
		synchronized(train)
		{
			System.out.println(getName()+"Book your train ");
			try {
				sleep(100);
			}
		catch(InterruptedException e) {
			e.getMessage();
			e.printStackTrace();
		}
			synchronized(comp) {
				System.out.println(getName()+"Book your compartment");
	            try {
	                sleep(100);
	            }
	            catch(InterruptedException e) {
	                e.getMessage();
	                e.printStackTrace();
	            }
			}
		}
		
	}
	}
	class cancelling extends Thread{
		Object train = null;
		Object comp = null;
		
		public cancelling(Object train, Object comp) {
	        this.train = train;
	        this.comp = comp;
	    }
		
	@Override
	public void run() {
		System.out.println(getName()+"cancel start");
		synchronized(comp) {
			System.out.println(getName()+"Cancel your compartment");
	        try {
	            sleep(100);
	        }
	        catch(InterruptedException e) {
	        	e.getMessage();
	        	e.printStackTrace();
	        }
		}
	}
	}
	
	 public static void main(String[] args) {
	        Object train = new Object();
	        Object comp = new Object();

	        Example example = new Example();

	        booking booking1 = example.new booking(train, comp);
	        booking booking2 = example.new booking(train, comp);

	        cancelling cancelling1 = example.new cancelling(train, comp);
	        cancelling cancelling2 = example.new cancelling(train, comp);

	        booking1.setName("Thread-1");
	        booking2.setName("Thread-2");
	        cancelling1.setName("Thread-3");
	        cancelling2.setName("Thread-4");

	        booking1.start();
	        booking2.start();
	        cancelling1.start();
	        cancelling2.start();
	    }
	}

