import java.util.*;


// LCM Using GCD
public class LCM {
  private static long lcm_fast(int a, int b) {
    	long gcd = gcd_fast(a,b);
    	// System.out.println(gcd);
    	// long product = a * b;
    	//NOTE : Don't multiply integers directly without converting them to long types.
    	long a1 = a;
    	long b1 = b;
    	long lcm = (a1 * b1) / gcd;
    	return lcm;
  }

  private static int gcd_fast(int a, int b) {
    	if(b == 0) {
    		return a;
    	}

    	 return gcd_fast(b,a%b);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_fast(a, b));
  }
}
