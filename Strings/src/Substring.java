import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int n = S.length();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if ((Character.isLetter(S.charAt(i)) == false)) 
            flag = false;
         }
        if((0 <= start && start<end && end<=n) && flag == true)
        {
            System.out.println(S.substring(start,end));
        }
    }
}