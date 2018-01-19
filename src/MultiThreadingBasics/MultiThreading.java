package MultiThreadingBasics;

public class MultiThreading extends Thread {
	
	public void run()
	{
		System.out.println("thread is running");
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading m=new MultiThreading();
		m.run();
		
		m.start();
		MultiThreading m1=new MultiThreading();
		m1.start();

	}

}
