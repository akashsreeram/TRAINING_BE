package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorConcept {
	public static void main(String[] args) {
		ExecutorService exe = Executors.newSingleThreadExecutor();
		
		exe.execute(new Task1());
		exe.execute(new Thread(new Task2()));
		
		System.out.print("Task3 Started");
		
		for(int i=300; i<=399; i++) {
		    System.out.print(i+" ");
		}
			System.out.print("\nTask3 Done ");
			
			System.out.print("\nMain Done ");
		
		
	}
}