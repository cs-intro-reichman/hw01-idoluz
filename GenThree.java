/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); 
      double r = Math.random();
         int n = (int) (r * N);
      double r2 = Math.random();
         int n2 = (int) (r2 * N);
      double r3 = Math.random();
         int n3 = (int) (r3 * N);
           System.out.println("random integers are");
           System.out.println(n);
           System.out.println(n2);
           System.out.println(n3);
             int min = Math.min(n,n2);
                min = Math.min(min,n3);
                   System.out.println( "the smallest int is " + min); 	
	}
}
