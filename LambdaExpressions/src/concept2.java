interface Price{
	double Car(String source, String destination);
}
public class concept2 {

	public static void main(String[] args) {
		Price p = (source, destination) ->{
			System.out.print("Your pricr for the folloeing journey is:" + "\n" + source + " " + "to " + destination);
			return 256.5;
		};
		double price = p.Car("Kondapur", "BanjaraHills");
		System.out.print(" "+price);
	}

}
