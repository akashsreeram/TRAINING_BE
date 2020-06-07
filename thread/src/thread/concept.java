package thread;

class Task1 extends Thread {
	public void run() {
		for(int i=100; i<=199; i++) {
			System.out.print(i+" ");
		}
			System.out.println("Task1 Done");
		}
	}
class Task2 implements Runnable {
	public void run() {
		for(int i=200; i<=299; i++) {
		    System.out.print(i+" ");
		}
			System.out.print("Task2 Done");
	}
}

public class concept {
	public static void main(String[] args) {
		System.out.println("Task1 started");
		Task1 task1 = new Task1();
		task1.start();
		
		System.out.println("Task2 started");
		Task2 task2 = new Task2();
		Thread Ttask2 = new Thread(task2);
		Ttask2.start();
		
		System.out.println("task3 started");
		
		for(int i=300; i<=399; i++) {
		    System.out.print(i+" ");
		}
			System.out.print("\nTask3 Done ");
			
			System.out.print("\nMain Done ");
	}
}