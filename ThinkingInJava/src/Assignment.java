
public class Assignment {
	public static void main(String [] args){
		Tank t1=new Tank();
		Tank t2=new Tank();
		t1.level=9;
		t2.level=45;
		System.out.println("t1.level="+t1.level+" t2.level="+t2.level);
		t1=t2;//�Զ���ֱ�����ã���t1��t2�󶨵�ͬһ��������
		System.out.println("t1.level="+t1.level+" t2.level="+t2.level);
		t1.level=20;
		System.out.println("t1.level="+t1.level+" t2.level="+t2.level);
	}	
}
class Tank{
	int level;
}
