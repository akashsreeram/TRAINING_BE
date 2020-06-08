import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Date {
	public static void p(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate hireDate = LocalDate.of(1996, Month.JULY, 18);
		p(now);
		p(hireDate);
		p(now.plusWeeks(1));
		p(now.minusWeeks(2));
		p(now);
		p(hireDate.isBefore(now));
		Period pe = Period.between(now, hireDate);
		p(pe);
	}
}
