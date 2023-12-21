/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	 int B = Integer.parseInt(args[0]);
         int U = Integer.parseInt(args[1]);
         int N = (U - B); 
      double r = Math.random();
      int n = (int) ((r * N) + B);
      double r2 = Math.random();
      int n2 = (int) ((r2 * N) + B);
      double r3 = Math.random();
      int n3 = (int) ((r3 * N) + B);
       System.out.println(n);
       System.out.println(n2);
       System.out.println(n3);
      int min = Math.min(n,n2);
       min = Math.min(min,n3);
      System.out.println( "The minimum random is "); 
      System.out.println(min);	
	}
}
