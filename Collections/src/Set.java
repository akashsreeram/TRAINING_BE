import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		HashSet states = new HashSet();
		states.add("Andhra");
		states.add("Telenagana");
		states.add("Andhra"); // has no effect duplicaiton is nmot allowed
		states.add("Arunachal Pradesh");
		System.out.println(states);
		System.out.println(states.contains("Andhra"));
	}
}
