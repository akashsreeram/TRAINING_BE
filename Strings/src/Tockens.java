import java.io.*;
import java.util.*;

public class Tockens {
    public static void main(String[] args) {
    	int count = 0;
    	
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String str[] = s.split("\\s|\\!|\\,|\\?|\\.|\\_|\\@|\\'");
        for (int i=0; i< str.length; i++) {
        	System.out.println(str[i]);
        }

        scan.close();
    }
}
