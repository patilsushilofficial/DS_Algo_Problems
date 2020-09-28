import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
 
    if(n == 0 || n == 1)
    	return n;
    else {
    	long ar[] = new long[n+1];

    ar[0] = 0;
    ar[1] = 1;

    for (int i = 2; i < ar.length; i++) {
    	ar[i] = ar[i-1] + ar[i-2];
    }
    return ar[n];
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(calc_fib(n));
  }
}
