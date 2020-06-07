interface Price{
	double Car(String source, String destination);
}
public class concept2 {
	 int instvar = 000; //instance variable
	static String statvar = "Vroom!!!"; //static variable
	public static void main(String[] args) {
		Price p = (source, destination) ->{
			String localvar = ";-]";//local variable
			System.out.println("Your pricr for the folloeing journey is:" + "\n" + source + " " + "to " + destination);
			System.out.println(" "+statvar+" "+localvar);
			return 256.5;
		};
		double price = p.Car("Kondapur", "BanjaraHills");		
		System.out.print(" "+price);
	}

}
