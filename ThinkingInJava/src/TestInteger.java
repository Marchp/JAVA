
public class TestInteger {
	public static void main(String [] args){
		int i1=127;
		Integer i2=127;
		Integer i3=new Integer(127);
		System.out.println(i1==i2);//true Integer�Զ������int�ٱ�
		System.out.println(i1==i3);//true
		System.out.println(i2==i3);//false  �ڴ��ַ��һ��
		
		Integer i4=new Integer(127);
		Integer i5=128;
		Integer i6=128;
		Integer i7=127;
		System.out.println(i3==i4);//false ����new integer����
		//������new��integer�������ֵ��-128-127֮�䣬��ȣ����򣬲����
		System.out.println(i5==i6);//false
		System.out.println(i2==i7);//true		
	}
}
