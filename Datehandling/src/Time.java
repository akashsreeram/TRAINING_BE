import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Time {
	public static void p(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime timehired = LocalTime.of(21, 30);
		p(now);
		p(timehired);
		p(now.plusHours(1));
		p(timehired.isAfter(now));
		LocalDateTime ls = LocalDateTime.now();
		p(ls);
		Period p = Period.of(3, 5, 12);
		p(p);
		p(ls.minus(p));
	}
}
