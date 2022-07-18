package typereturn22;

public class sample2 {
	
	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		int num3=4;
		
		
	 int num4  = add(num1,num2);
     System.out.println(num4);
		
		int num5=sample1.mult(num3, num4);
		System.out.println(num5);
		
		
	String s2	=covert("akshay");
		System.out.println(s2);
		System.out.println(covert("Shivaji"));
		
	}
	
	
	
	public static int  add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static String covert(String s1) {
		String name=s1.toUpperCase();
		return name;
	}
	

}
