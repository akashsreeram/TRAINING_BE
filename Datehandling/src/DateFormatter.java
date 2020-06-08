import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.*;

public class DateFormatter {
	public static void p(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtf4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		p(now.format(dtf1));
		p(now.format(dtf2));
		p(now.format(dtf3));
		p(now.format(dtf4));
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/d/M");
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("dd 'in the year of:' yyyy" );
		p(now.format(dtf5));
		p(now.format(dtf6));
	}

}
