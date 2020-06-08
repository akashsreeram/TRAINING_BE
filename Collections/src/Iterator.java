import java.util.*;

public class Iterator {
	public static void main(String[] args) {
		ArrayList lang = new ArrayList();
		lang.add("Java");
		lang.add("C");
		lang.add("C++");
		lang.add("JavaScript");
		java.util.Iterator i = lang.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		lang.remove("C++");
		lang.set(1, "Second Element");
		java.util.Iterator i2 = lang.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
