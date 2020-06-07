interface Calculator{
	void add(int num1,int num2);
}
class Calc{
	public static void add(int num1,int num2) {
		System.out.println("Sum is:"+(num1+num2));
	}
	public void letsAdd(int num1, int num2) {
		System.out.println("Sum is:"+(num1+num2));
	}
}

interface Messenger{
	Message getMessages(String msg);
}
class Message{
	Message(String msg){
		System.out.println("Message is: " + msg);
	}
}
public class references {
	public static void main(String[] args) {
		Calc.add(10, 20);
		
		Calculator cref = Calc::add; //Static method referencing
		cref.add(10,30);
				
		Calc calc = new Calc(); //non-static referencing
		Calculator dref = calc::letsAdd;
		dref.add(12, 13);
		
		Messenger mref = Message::new; //Constructor referencing 
		mref.getMessages("Hey!!!");
	}

}
