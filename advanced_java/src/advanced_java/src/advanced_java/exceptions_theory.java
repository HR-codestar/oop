//exceptions - 


//types of exceptions -
//~checked 
//~unchecked

/* exceptions are different from errors as error represent irrecoverable system 
issue while exceptions are are recoverable

exceptions occur in the following cases -

~ dividing by zero 
~ file not found
~ array index out of bound

exception handling - 

~ prevents the progarm from crashing by providing a way to do clean up operations 
~ makes the application more tollerent i.e. the program won't stop because of a single
error
~ we can controll the flow of the program when an exception is found
~ we can manage exceptions by using some blocks namely try catch and finally 


keywords in exception handling - 

~ try
~ catch
~ finally
~ throw

//ex 1 - 

package advanced_java;
import java.util.Scanner;

public class exceptions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the numerator");
		Float  numerator = scanner.nextFloat();
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter the denominator");
		Float denominator = scanner.nextFloat();
		
		
		try {
		float result = numerator/denominator;
		System.out.println(result);
		}
		catch(ArithmeticException a) {
			System.out.println("ArithmeticException caught :"+a.getMessage());
		}
		finally {
			scanner.close();
			System.out.println("byebye!");
			}
	}
}

ex 2 - 

package advanced_java;
import java.util.Scanner;
public class exceptions{
	public static void main(String[] args) {
		
		
		
		try {
		int numbers[] = {1,2,3};
	int result = numbers[3]/5;
		}
	catch(ArithmeticException a){
		System.out.println("ArithmeticException caught :"+a.getMessage());
	}
	catch(IndexOutOfBoundsException b) {
		System.out.println("IndexOutOfBoundsException caught :"+b.getMessage());
	}
	finally {
		System.out.println("byebye!");
	}
	}
}


// throw -


~ the order of catch blocsks must be from most relevant to generic cases
~ if multiple catch blocks match with the exception then he first one will be executed
 
 
 
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
			else {
				System.out.println("the age is valid and doesn't contain any error"); 
			}
		}
	
}

Unchecked exceptions :

An unchecked exception (also known as an runtime exception) in Java is something that has 
gone wrong with the program and is unrecoverable. Just because this is not a compile time 
exception, meaning you do not need to handle it, that does not mean you don't need to be 
concerned about it.
Unchecked exceptions are exceptions that are not checked at compile-time. They are not 
 required to be caught or declared.
They are subclasses of RuntimeException.
The Java compiler does not check unchecked exceptions at compile-time thats why they are 
called unchecked exceptions.

examples - 

~ NullPointerException
~ ArrayIndexOutOfBoundsException
~ ArithmeticException
~ IllegalArgumentException

Checked exceptions :

A checked exception is not caught at compile time but is checked by the compiler at the 
 comile time whether an exceptin is there or not.A checked exception must be handled 
 either by re-throwing or with a try catch block
Checked exceptions are exceptions that must be either caught or declared in the method 
 signature using a throws clause.
They are subclasses of Exceptions.
The Java compiler checks checked exceptions at compile-time.If a method can throw a 
 checked exception, it must either handle the exception using a try-catch block or 
 declare it using the throws keyword.

examples -

~ IOException
~ SQLException
~ FileNotFoundException
~ ClassNotFoundException
 
 

custom exceptions :

ex - 

main file -

package test;
import advanced_java.AgeException;

public class oop{
	public static void main(String[] args) {
	try {
	 char a = 'v' ;
	 validatechar(a);
	}
	catch(AgeException w) {
		System.out.println("enter different character "+ w.getMessage());
	}
	
	}
	
	public static void validatechar(char any) throws AgeException {
		if((any<='Z') &(any>='A')) {
			throw new AgeException("the char should be non-bold");
		}
		else {
			System.out.println("the character is valid");
		}
	}
}
 
exception class -

package advanced_java;
public class AgeException extends Exception{
	public AgeException(String message) {
		super(message);
	}
	

 
 without static method - 
 
main file- 
 
package test;
import advanced_java.AgeException;

public class oop {
    public static void main(String[] args) {
        oop oop = new oop(); // Create an instance of the oop class
        try {
            char a = 'K';
            oop.validateChar(a); // Call the non-static method on the instance
        } catch (AgeException w) {
            System.out.println("Enter a different character: " + w.getMessage());
        }
    }

    // Non-static method
    public void validateChar(char any) throws AgeException {
        if ((any >= 'A') && (any <= 'Z')) {
            throw new AgeException("The character should be non-uppercase");
        }
        else {
        	System.out.println("the char is valid");
        }
    }
}

exception class -

package advanced_java;
public class AgeException extends Exception{
	public AgeException(String message) {
		super(message);
	}
	
}
 
when we create a non-static function and we want to access it,we have to create an instance
or an object from which we have the call the non-static method or function



ex 1 -


main class - 

package advanced_java;
import java.util.Scanner;
public class oddnumber {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	int number = s.nextInt();
	
	try {
		int num = number;
		validate(num);
	}
	catch(oddNumberException e) {
		System.out.println("please enter a different number "+e.getMessage());
	}
	
}
public static void validate(int number) throws oddNumberException{
	if(number%2!=0) {
		throw new oddNumberException("the number you entered is an odd number");
	}
	else {
		System.out.println("the number you have entered is even you can proceed");
	}
}
}


exception class - 


package advanced_java;

public class oddNumberException extends Exception{
	public oddNumberException(String message) {
		super(message);
	}
}

ex 2 -

exception class - 


package advanced_java;

public class notVowelException extends Exception {
	public notVowelException(String message) {
	super(message);
	}


main class


package advanced_java;
import java.util.Scanner;
public class notVowel {

	public static void main(String[] args) {
		
	System.out.println("enter the character");
	Scanner s = new Scanner(System.in);
	String a = s.nextLine();
	
	try {
		String str = a;
		validate(a);
		}
    catch(notVowelException e) {
    	System.out.println("Enter a different character "+e.getMessage());
    }
	}
    public static void validate(String a) throws notVowelException{
    	if (!a.matches(".*[AEIOUaeiou].*")) {
    		throw new notVowelException(",the character entered is not an vowel");
        	
    	}
    	else {
    		System.out.println("you are good to proceed");
    	}
    }
}


 */

