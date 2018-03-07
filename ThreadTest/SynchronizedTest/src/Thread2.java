public class Thread2 { 
	//��һ���̷߳���synchronized(this)ͬ�������ʱ��
	//��һ���߳���Ȼ���Է��ʷ�synchronized(this)ͬ�������
	     public void f1() { 
	          synchronized(this) { 
	               int i = 5; 
	               while( i-- > 0) { 
	                    System.out.println(Thread.currentThread().getName() 
	                    		+ " synchronized " + i); 
	                    try { 
	                         Thread.sleep(500); 
	                    } catch (InterruptedException ie) { 
	                    } 
	               } 
	          } 
	     } 
	     public void f2() { 
	    	 int i = 5; 
	          while( i-- > 0) { 
	               System.out.println(Thread.currentThread().getName() 
	            		   + " nonsynchronized " + i); 
	               try { 
	                    Thread.sleep(500); 
	               } catch (InterruptedException ie) { 
	               } 
	          } 
	    	}
	   
	     public static void main(String[] args) { 
	          final Thread2 t= new Thread2(); 
	          Thread t1 = new Thread(  new Runnable() {  public void run() { t.f1();  }  }, "t1"  ); 
	          Thread t2 = new Thread(  new Runnable() {  public void run() { t.f2();  }  }, "t2"  ); 
	         
	          t2.start(); 
	          t1.start(); 
	     }
	}