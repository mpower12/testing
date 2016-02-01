package main;

public class ThreadTest {

	static MultiThreadTest test;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test = new MultiThreadTest();
		Thread t1 = new Thread(test);
		
		t1.setDaemon(true);
		t1.start();
		//System.out.println(test.getCount());
		startCount();
		
	}
	
	public static void startCount(){
		while(true){
			
			System.out.println(test.getCount());
		}
	}

}
