package test;
class vehicle extends oop{
     double interest;
     private float balance;
		public vehicle(String N, float B,double h) {
			super(N, B);
			this.interest = h;
		}
		@Override
		void calculate(double interest) {
	    	
	    	double amount = balance*interest;
	    	balance+=amount;
	    	System.out.println("the interest collected is " +interest+" and the balance is "+balance);
    	
    }
    
    
    
}