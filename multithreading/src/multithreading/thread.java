package multithreading;
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

