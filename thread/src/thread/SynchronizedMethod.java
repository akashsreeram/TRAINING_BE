package thread;

class Printer{
	synchronized void printDocument(int copies, String docname) {
		for(int i=1; i<=copies; i++) {
			System.out.println("Printing:"+ i + " " + docname);
		}
	}
}

class Person1 extends Thread{
	Printer pRef;
	Person1(Printer p){
		pRef=p;
	}
	public void run() {
		pRef.printDocument(10, "person1");
	}
}
class Person2 extends Thread{
	Printer pRef;
	Person2(Printer p){
		pRef=p;
	}
	public void run() {
		pRef.printDocument(10, "person2");
	}
}
public class SynchronizedMethod {
	public static void main(String[] aregs) {
		System.out.println("Main thread Start");
		Printer printer = new Printer();
		Person1 p1 = new Person1(printer);
		Person2 p2 = new Person2(printer);
		p2.start();
		p1.start();
		System.out.println("Main thread End");
	}
}
