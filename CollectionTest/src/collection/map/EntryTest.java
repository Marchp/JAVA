package collection.map;

import java.util.HashMap;
import java.util.Random;

public class EntryTest {

	public static void main(String [] args) {
		EntryTest();
	}
	
	private static void EntryTest() {
		
		//新建hashmap以及初始化随机数种子
		HashMap hm=new HashMap();
		Random r=new Random();
		
		//初始化hashmap
		hm.put(0, r.nextInt(10));
		hm.put(1, r.nextInt(10));
		hm.put(2, r.nextInt(10));
		hm.put(3, r.nextInt(10));
		
		//打印hashmap
		System.out.println("map:"+hm);
		
		//判断是否包含键=key的键值对，并输出该key对应的value
		if(hm.containsKey(1))
			System.out.println(hm.get(1));
		
		System.out.println("value=5 exists?:"+hm.containsValue(5));
		
		hm.remove(2);
		
		System.out.println(hm.clone());
		
	
		
	}
}
