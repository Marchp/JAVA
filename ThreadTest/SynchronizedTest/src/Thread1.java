public class Thread1 implements Runnable {
	public void run() {
		//���������߳�ͬʱ����һ������죬�������ʹ��synchronized�ؼ��֣�һ��ʱ����ֻ��һ���߳��ܹ�����
        //��һ���߳�ֻ�еȴ���ǰ�߳�ִ�������ִ�иô���
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
