import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class trycatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int a = sc.nextInt();
        int b = sc.nextInt();
        int div=a/b;
        System.out.println(div);
        }
        catch(java.util.InputMismatchException ex){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
