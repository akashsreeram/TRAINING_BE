import java.util.Scanner;

public class Substringcomp {

 
    public static String getSmallestAndLargest(String s, int k) {
        int count;
        String temp;
        String smallest = "";
        String largest = "";
        String lex[] = new String[s.length()-k+1];
        for(int i=0; i<(s.length()-(k-1)); i++){
            String tem = s.substring(i,i+(k));
            lex[i] = tem;
        }
        count = s.length()-k+1;
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
            { 
                if (lex[i].compareTo(lex[j]) > 0) 
                {
                    temp = lex[i];
                    lex[i] = lex[j];
                    lex[j] = temp;
                }
            }
        }
        smallest=lex[0];
        largest=lex[count-1];
        return smallest + "\n" + largest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}