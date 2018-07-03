package recursive;

public class gcd {
	static int gcd(int a, int b) {
	 if (a==0||b==0)
       return 0;
	 if (a==b)
	   return a;
	 if (a>b)
		return gcd(a-b,b);
	 return gcd(a,b-a);
	}
	public static void main(String[] args) {
		 int a=100, b=52;
		 System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
	}

}
