package collection.map;

import java.util.HashMap;
import java.util.Random;

public class EntryTest {

	public static void main(String [] args) {
		EntryTest();
	}
	
	private static void EntryTest() {
		
		//�½�hashmap�Լ���ʼ�����������
		HashMap hm=new HashMap();
		Random r=new Random();
		
		//��ʼ��hashmap
		hm.put(0, r.nextInt(10));
		hm.put(1, r.nextInt(10));
		hm.put(2, r.nextInt(10));
		hm.put(3, r.nextInt(10));
		
		//��ӡhashmap
		System.out.println("map:"+hm);
		
		//�ж��Ƿ������=key�ļ�ֵ�ԣ��������key��Ӧ��value
		if(hm.containsKey(1))
			System.out.println(hm.get(1));
		
		System.out.println("value=5 exists?:"+hm.containsValue(5));
		
		hm.remove(2);
		
		System.out.println(hm.clone());
		
	
		
	}
}
