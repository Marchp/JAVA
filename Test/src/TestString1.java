
public class TestString1 {
	public static void main(String [] args)
	{
		int j=1253658;
		String snumber=String.valueOf(j);
		System.out.println("jÊÇ"+snumber.length()+"Î»Êý");
		String s="Mary,F,1978";
		String [] sPlit=s.split(",");
		for(int i=0;i<sPlit.length;i++)
		System.out.println(sPlit[i]);
	
	}

}
