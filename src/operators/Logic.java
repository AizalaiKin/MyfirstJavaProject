package operators;

public class Logic {
	public static void main (String []args)  { 
		boolean i = 6 >3;
		System.out.println(i);
		System.out.println(34<12);
		int balance = 100;
		boolean broke = balance < 20;
		System.out.println(broke);
		
		System.out.println(balance ==100);
		
		String expected = "Google search";
		String str = "Google search";
		System.out.println(expected.contentEquals(str));
	}
	

}
