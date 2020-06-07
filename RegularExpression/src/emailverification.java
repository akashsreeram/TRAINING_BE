import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailverification {
	public static void main(String[] args) {
		String reg = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(reg);
		System.out.println("Enter email address");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Matcher matcher = pattern.matcher(s);
		System.out.println(matcher.matches());
	}
}
