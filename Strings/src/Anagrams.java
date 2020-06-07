import java.util.*;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();

        char s1[] = a.toCharArray();
        char s2[] = b.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        StringBuilder sb = new StringBuilder();
        String s11 = new String(sb.append(s1));
        StringBuilder sb2 = new StringBuilder();
        String s12 = new String(sb2.append(s2));

        if(s11.equals(s12))
        return true;
        else
        return false;
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}