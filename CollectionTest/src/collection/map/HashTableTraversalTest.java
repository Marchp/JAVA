package collection.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class HashTableTraversalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val=0;
		String key=null;
		Integer value=null;
        //�������������
		Random r=new Random(100);
		//����hashtable����
		Hashtable ht=new Hashtable();
	
		//��ʼ��hashtable
		for(int i=0;i<10;i++) {
			val=r.nextInt(100);
			//����key-value��ֵ
			key=String.valueOf(val);
			value=r.nextInt(5);
			ht.put(key,value);
		
		}
		
		//��ӡhashtable
		System.out.println("Hashtable:"+ht);
		
		//����iterator������ͨ����ȡ����ֵ�ԡ���set���ϱ���hashtable
		iteratorHashtableByEntryset(ht);	
		//����iterator������ͨ����ȡ��������set���ϱ���hashtable
		iteratorHashtableByKeyset(ht);
		//����iterator������ͨ����ȡ��ֵ����set���ϱ���hashtable
		iteratorHashtableByValue(ht);
		
		//����enumerationͨ��Keys()��ȡhashtable���б���
		enumerationByKeys(ht);
		//����enumerationͨ��Elements()��ȡhashtable�ġ�ֵ�������б���
		enumerationByElements(ht);
		

	}
	
	private static void iteratorHashtableByEntryset (Hashtable ht) {
		
		String key=null;
		Integer value=null;
		
		System.out.println("Iterator Hashtable By EntrySet:");
		Iterator ite=ht.entrySet().iterator();
		while(ite.hasNext()) {
			 Map.Entry entry = (Map.Entry)ite.next();
			 
			 key=(String)entry.getKey();
			 value=(Integer)entry.getValue();
			 
			 System.out.println("key="+key+"----"+"Value:"+value);
		}
	}
	
    private static void iteratorHashtableByKeyset (Hashtable ht) {
		
		String key=null;
		Integer value=null;
		
		System.out.println("Iterator Hashtable By KeySet:");
		Iterator ite=ht.keySet().iterator();
		while(ite.hasNext()) {
			 key=(String)ite.next();
			 value=(Integer)ht.get(key);
			 
			 System.out.println("key="+key+"----"+"Value:"+value);
		}
	}

    private static void iteratorHashtableByValue (Hashtable ht) {
	
	String key=null;
	Integer value=null;
	
	System.out.println("Iterator Hashtable By Value:");
	Iterator ite=ht.values().iterator();
	while(ite.hasNext()) {
		 value=(Integer)ite.next();
		 
		 System.out.println("Value:"+value);
	}
}

    private static void enumerationByKeys(Hashtable ht) {
    	
    	String  key=null;
    	Integer value=null;
    	
    	System.out.println("enumeration Hashtable By Keys");
    	Enumeration en=ht.keys();
    	while(en.hasMoreElements()) {
    		key=(String)en.nextElement();
    		value=(Integer)ht.get(key);
    		
    		System.out.println("key="+key+"----"+"Value:"+value);
    	}
    }

    private static void enumerationByElements(Hashtable ht) {
    	
    	String  key=null;
    	Integer value=null;
    	
    	System.out.println("enumeration Hashtable By Elements");
    	Enumeration en=ht.elements();
    	while(en.hasMoreElements()) {	
    		System.out.println("Value:"+en.nextElement());
    	}
    }





}


