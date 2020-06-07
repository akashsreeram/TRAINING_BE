import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class concept {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("xx");
		Matcher matcher = pattern.matcher("AxxB");
		System.out.println(matcher.find() +""+ matcher.start());
		System.out.println("String matches the given Regex - " + matcher.matches());
		System.out.println(Pattern.matches("[xyz]","wbcd"));
		System.out.println(Pattern.matches("[xyz]","x"));
		System.out.println(Pattern.matches("[xyz]","xxyyzzzz"));
		System.out.println(Pattern.matches("[xyz]","axdysz"));
		System.out.println(Pattern.matches("[xyz]?","x"));
		System.out.println(Pattern.matches("[xyz]?","xxx"));
		System.out.println(Pattern.matches("[xyz]+","xxyyzzzz"));
		System.out.println(Pattern.matches("[xyz]+ ","axdysz"));
		
	}
}
