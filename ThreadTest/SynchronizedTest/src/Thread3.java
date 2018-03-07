
public class Thread3 { 
	//当一个线程访问synchronized(this)同步代码块时，
	//另一个线程不能同时访问其余的synchronized(this)同步代码块，
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