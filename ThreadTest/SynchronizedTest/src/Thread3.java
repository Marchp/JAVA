
public class Thread3 { 
	//��һ���̷߳���synchronized(this)ͬ�������ʱ��
	//��һ���̲߳���ͬʱ���������synchronized(this)ͬ������飬
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
	   
	     public static void main(String[] args) { 
	          final Thread3 t= new Thread3(); 
	          Thread t1 = new Thread(  new Runnable() {  public void run() { t.f1();  }  }, "t1"  ); 
	          Thread t2 = new Thread(  new Runnable() {  public void run() { t.f2();  }  }, "t2"  ); 
	          t1.start();
	          t2.start(); 
	           
	     }
	}