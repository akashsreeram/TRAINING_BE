import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class loops1 {
	  private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        if((2<=N) &&  (N<= 20))
	        {
	        for (int i = 1; i<=10; i++){
	            System.out.println(N + " x" + " " + i + " " + "=" + " " + (N*i));
	        }
	        }
	        scanner.close();
	    }
}
