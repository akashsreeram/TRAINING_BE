import java.util.*;
import java.io.*;

public class loops2 {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int sum = 0,a = 0, b = 0, n = 0;
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            a = in.nextInt();
	            b = in.nextInt();
	            n = in.nextInt();
	            sum = a;
	            for(int j=0; j<n; j++)
	            {
	                sum = sum + (int) (Math.pow(2,j)*b);
	                System.out.print(sum + " ");
	            }
	            System.out.println();
	        }
	        in.close();
	    }
}
