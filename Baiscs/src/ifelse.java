import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if((1<=n) && (n<=100))
        {
        if(n %2 != 0){
            System.out.println("Weird");
        }
        else{
            if(((2<=n)&&(n<=5))||(n>20)){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
        }
        }
        scanner.close();
    }
}
