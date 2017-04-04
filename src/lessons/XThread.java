package lessons;

public class XThread extends Thread {
	XThread(){
	
	}
	XThread(String threadName){
		super(threadName);
		System.out.println(this);
		start();
	}
	public void run(){
		//display info about this particular thread
		System.out.println(Thread.currentThread().getName());
	}
}
