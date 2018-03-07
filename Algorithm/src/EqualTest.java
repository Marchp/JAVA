
public class EqualTest {
	
	/**
     * a simple program  show the difference between "==" and "equals" in the console
     * @name EqualTeat
     * @author Marchp  
     * @version 13 March 2017
     */
	
	public static void main(String[] args)
	{
		int t1=24;
		int t2=34;
		int t3=58;
		int t4=58;
		
		boolean result1=(t1==t2);
		boolean result2=((t1+t2)==t3);
		boolean result3=(t3==t4);
		
		System.out.println("----[t1=t2?]:"+result1+"\n----[(t1+t1)=t3?]:"+result2+"\n----[t3=t4?]:"+result3);
		
		Integer i1=new Integer(t1);
		Integer i2=new Integer(t2);
		Integer i3=new Integer(t3);
		Integer i4=new Integer(t4);
		
		boolean r1=i1.equals(i2);
		boolean r2=i3.equals(i1+i2);
		boolean r3=i3.equals(i4);
		
		System.out.println("\n----i1.equals(i2)?:"+r1+"\n----i3.equals(i1+i2)?:"+r2+"\n----i3.equals(i4)?:"+r3);
		
		String str1="Marchp ";
		String str2="will succeed";
	    String str3="Marchp will succeed";
	    String str4="Marchp will succeed";
	    
	    boolean b1=(str1==str2);
	    boolean b2=((str1+str2)==str3);
	    boolean b3=(str3==str4);
	    
	    System.out.println("\n----[str1==str2?]:"+b1+"\n----[(str1+str2)==str3?]:"+b2+"\n----[str3==str4?]:"+b3);
	    
	    boolean a1=str1.equals(str2);
	    boolean a2=(str1+str2).equals(str3);
        boolean a3=str3.equals(str4);
        
        System.out.println("\n----str1.equals(str2)?:"+a1+"\n----(str1+str2).equals(str3)"+a2+"\n----str3.equals(str4)"+a3);
	}

	
}
