package thread;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallbackTasks implements Callable<String>{
	String name;
	public CallbackTasks(String name) {
		this.name = name;
	}
	public String call() throws Exception{
		Thread.sleep(1000);
		return "Hello" + name;
	}
}

 
public class Futurefeature {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exe = Executors.newFixedThreadPool(2); 
		Future<String> wel = exe.submit(new CallbackTasks(" this ia AKASH"));
		String msg = wel.get();
		System.out.print(msg);
	}
}
