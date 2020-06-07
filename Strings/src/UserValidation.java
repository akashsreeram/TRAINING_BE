import java.util.*;

public class UserValidation {
	public static void main(String[] args) {
		int len = 0;
		boolean result = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Users");
		int n = sc.nextInt();
		String a[] = new String[n];
		System.out.println("Enter Users");
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}

		for (int v = 0; v < n; v++) {
			len = a[v].length();
			for (int j = 0; j < a[v].length(); j++) {
				if ((len >= 8 && len <= 30) && (Character.isLetter(a[v].charAt(0)))) {
					if ((a[v].charAt(j) == '?') || (a[v].charAt(j) == ';')) {
						result = false;
					}
				} else {
					result = false;
				}
			}
			System.out.println("Username_" + a[v] + "_status:" + result);
			result = true;
		}
	}
}
