import java.util.*;

public class TreeSet {
	public static void main(String[] args) {

        TreeSet ts1 = new TreeSet(); 
  
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
  
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
	}
}
