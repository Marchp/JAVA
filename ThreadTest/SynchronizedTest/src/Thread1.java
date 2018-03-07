public class Thread1 implements Runnable {
	public void run() {
		//两个并发线程同时访问一个代码快，若代码块使用synchronized关键字，一段时间内只有一个线程能够访问
        //另一段线程只有等待当前线程执行完才能执行该代码
		synchronized(this) {
            for (int i = 0; i < 5; i++) { 
                 System.out.println(Thread.currentThread().getName()
                		 + " synchronized loop " + i); 
            } 
       }  
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t=new Thread1();
		Thread t1=new Thread(t,"1");
		Thread t2=new Thread(t,"2");
		
		t1.start();
		t2.start();

	}

}
