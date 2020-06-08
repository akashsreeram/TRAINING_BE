package thread;

class Printers {
	void printDocument(int copies, String docname) {
		for (int i = 1; i <= copies; i++) {
			System.out.println("Printing:" + i + " " + docname);
		}
	}
}

class Person11 extends Thread {
	Printers pRef;

	Person11(Printers p) {
		pRef = p;
	}

	public void run() {
		synchronized (pRef) {
			pRef.printDocument(10, "person1");
		}
	}
}

class Person12 extends Thread {
	Printers pRef;

	Person12(Printers p) {
		pRef = p;
	}

	public void run() {
		synchronized (pRef) {
			pRef.printDocument(10, "person2");
		}
	}
}

public class SynchronizedBlock {
	public static void main(String[] aregs) {
		System.out.println("Main thread Start");
		Printers printer = new Printers();
		Person11 p1 = new Person11(printer);
		Person12 p2 = new Person12(printer);
		p2.start();
		p1.start();
		System.out.println("Main thread End");
	}
}
