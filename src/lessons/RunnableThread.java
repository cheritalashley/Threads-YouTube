//Running thread using the runnable interface instead of extending the Thread class
//To start the thread you need to invoke the start() method on the object
package lessons;

public class RunnableThread implements Runnable{
	Thread runner;
	public RunnableThread(){
	
	}
	public RunnableThread(String threadName){
		runner=new Thread(this, threadName); //create a new thread
	}
	System.out.println(runner.getName());
	runner.start(); // start the thread
	}
	public void run(){
		//display info about the thread
		System.out.println(Thread.currentThread());
	}
}
