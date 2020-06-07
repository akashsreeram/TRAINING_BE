package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

class CallTask implements Callable<String>{
    
    private String name;
    
    public CallTask(String name){
        this.name = name;
    }
    
    public String call() {
        return "Hello" + name;
    }
    
}
    public class ThreadReturn {
        public static void main(String[] args) throws InterruptedException, ExecutionException {
         
        ExecutorService exe = Executors.newFixedThreadPool(1);  
        
        Future<String> welcome = exe.submit( new CallTask("HEY_HERE"));
        
        System.out.println("new callable Task executed");
        
        String msg = welcome.get();
        
        System.out.println(msg);
        
        System.out.println("Done");
        }
}