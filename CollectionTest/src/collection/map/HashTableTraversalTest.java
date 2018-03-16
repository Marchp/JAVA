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
        //定义随机数种子
		Random r=new Random(100);
		//创建hashtable对象
		Hashtable ht=new Hashtable();
	
		//初始化hashtable
		for(int i=0;i<10;i++) {
			val=r.nextInt(100);
			//定义key-value的值
			key=String.valueOf(val);
			value=r.nextInt(5);
			ht.put(key,value);
		
		}
		
		//打印hashtable
		System.out.println("Hashtable:"+ht);
		
		//利用iterator迭代器通过获取“键值对”的set集合遍历hashtable
		iteratorHashtableByEntryset(ht);	
		//利用iterator迭代器通过获取“键”的set集合遍历hashtable
		iteratorHashtableByKeyset(ht);
		//利用iterator迭代器通过获取“值”的set集合遍历hashtable
		iteratorHashtableByValue(ht);
		
		//利用enumeration通过Keys()获取hashtable进行遍历
		enumerationByKeys(ht);
		//利用enumeration通过Elements()获取hashtable的“值集”进行遍历
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


