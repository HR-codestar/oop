package advanced_java;
public class exceptions{
	public static void main(String[]args) {
		
		try {
		int age = 5;
		validateAge(age);
		}
		catch(IllegalArgumentException a) {
			System.out.println("IllegalArgumentException caught :"+a.getMessage())
	;	}
		finally {
			System.out.println("byebye!")
;		}
		
	}
		public static  void validateAge(int age){
			if (age<0){
				throw new IllegalArgumentException("age cannot be negative");
			}
		}
	
}

