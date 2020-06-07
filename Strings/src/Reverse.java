import java.io.*;
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder temp = new StringBuilder(A);
        temp = temp.reverse(); 
        String str = new String(temp);
        if (A.equals(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



