package test;

public class newclass {
	public static void main(String[] args) {
	String a = "abc234nhdy22";
	System.out.println(a.indexOf('2',4));
	System.out.println(a.indexOf(2));
	String b = a.substring(5);
	System.out.println(b);
	StringBuffer a1 = new StringBuffer("a");
	a1.append("hello\n");
	a1.append("test");
	System.out.println(a1);
	
	StringBuilder c = new StringBuilder("abdefghijklmnop");
	c.append("xyz");
	System.out.println(c);
	c.delete(0,2);
	System.out.println(c);
	c.deleteCharAt(2);
	System.out.println(c);
	
	//System.out.printf("hi ra %d","huha");
	
	String b1 = "abc";
	String b2 = "ABC";//compareto method gives the difference between the asci value of the chars
	System.out.println(b1.compareTo(b2));
	System.out.println(b1.compareToIgnoreCase(b2));
	
	/*for(int i = 0 ; i<257 ; i++) {
		System.out.println(i +":"+(char)i);
	}*/
	String s = "abc info";
	System.out.println(s.startsWith("abc"));
	System.out.println(s.endsWith("f"));
	System.out.println(s.substring(4,6));
	
	StringBuffer e1 = new StringBuffer();
	e1.append("abc");
	e1.append("info");
	
	StringBuffer e2 = new StringBuffer();
	e2.append("abc");
	e2.append("info");
	
	System.out.println(e1.equals(e2));
	System.out.println(e1==e2);
	
	String sd = "  andbs najid";
	System.out.println(sd.trim());
	
	System.out.println(c.capacity());
	
	
	
	
	
	
	}
}
