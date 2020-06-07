
interface displayable{
	void display(String msg);
}
public class concept {
	public static void main(String args[]) {
		displayable disp = (msg)->{
			System.out.println(msg);
		};
		disp.display("This is Lambda function");
	}
}
