package Multithreading;
class MyThread2 implements Runnable{
	public void run() {
		System.out.println("Child Thread Running...");
	}
}
public class MulthreadWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 m=new MyThread2();
		Thread t=new Thread(m);
        t.start();
        
        System.out.println("Main Thread Running...");
        
	}

}
