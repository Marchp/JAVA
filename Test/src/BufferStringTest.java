 
public class BufferStringTest {
	public static void main(String [] args)
	{
		Integer i=new Integer(100);
		Double d=new Double("123.456");
		int j=i.intValue()+d.intValue();
		float f=i.floatValue()+d.floatValue();
		System.out.println(j);
		System.out.println(f);
		
		double pi=Double.parseDouble("3.1415926");
		double r=Double.valueOf("2.0").doubleValue();
		double s=pi*r*r;
		System.out.println(s);
		
		try{
			int k=Integer.parseInt("1.25");
		}catch(NumberFormatException e){
			System.out.println("���ݸ�ʽ����ȷ!");
		}
		
		System.out.println(Integer.toBinaryString(123)+"B");//����ֵ�Զ�������ʽ���ֳ���
		System.out.println(Integer.toHexString(123)+"H");//����ֵ��ʮ��������ʽ���ֳ���
		System.out.println(Integer.toOctalString(123)+"O ");//����ֵ�԰˽�����ʽ���ֳ���
		
		
	}	
}
