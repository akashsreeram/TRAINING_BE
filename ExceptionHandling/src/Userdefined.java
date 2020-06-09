import java.util.Scanner;

class MyCalculator {
	int a, b;

	public int power(int a, int b){
       this.a = a;
       this.b = b;
       int pow = 1;
       for(int i=1; i<=b; i++){
           pow = pow*a;
        }
        if((a==0)&&(b==0)){
                //throwing exception using anonymous inner class
 
                throw new ArithmeticException()
                {
                    @Override
                    public String toString()
                    {
                        return "java.lang.Exception: n and p should not be zero.";
                    }
                };
        }
        else if((a<0)||(b<0)){
            //throwing exception using anonymous inner class
            throw new ArithmeticException()
            {
                @Override
                public String toString()
                {
                    return "java.lang.Exception: n and p should not be zero.";
                }
            };
    }
        return pow;}


}

public class Userdefined {
	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}