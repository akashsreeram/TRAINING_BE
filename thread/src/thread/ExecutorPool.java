package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;
    
    public Task(int number){
        this.number = number;
    }
    
    public void run(){
        System.out.println("Task"+ number + "Started");
        
        for(int i=number*10; i<=((number*10)+9); i++ )
            {
                System.out.print(i+" ");
            }
            
        System.out.println("Task"+ number + "finished" );
    }
}
    
    public class ExecutorPool {
        public static void main(String[] args){
            ExecutorService exe = Executors.newFixedThreadPool(2);
            
            exe.execute(new Task(1));
            exe.execute(new Task(2));
            exe.execute(new Task(3));
            exe.execute(new Task(4));


            exe.shutdown();
        }
    }