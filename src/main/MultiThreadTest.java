package main;

public class MultiThreadTest implements Runnable {
	public int count = 0;
	public MultiThreadTest(){
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				this.wait(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			System.out.println(count);
		}
	}
	
	public int getCount(){
		return count;
	}

}
