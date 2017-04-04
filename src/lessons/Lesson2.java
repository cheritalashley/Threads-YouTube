package lessons;

class MyClassTh implements Runnable{
	
	@Override
	public void run(){ 
	for (int i=0; i<10; i++){
		System.out.println(Thread.currentThread().getId() + "value: "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Lesson2 {

	public static void main(String[] args) {
		Thread thread=new Thread(new MyClassTh());
		Thread thread1=new Thread(new MyClassTh());
		thread.start();
		thread1.start();
		

	}

}
