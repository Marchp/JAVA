package collection.map;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String [] args) {
		//调用treemaptestapis
		treemaptestapis();
		testSubMapAPIs();
		testNavigableMapAPIs();
	}
	
	/*
	 *测试treemap常用的 API
	 */
	private static void treemaptestapis() {
		//初始化随机数种子
		Random r=new Random(100);
		//创建treemap对象
		TreeMap tm=new TreeMap();
		
		//初始化treemap
		tm.put("F", r.nextInt(100));
		tm.put("C", r.nextInt(100));
		tm.put("A", r.nextInt(100));
		tm.put("D", r.nextInt(100));
		tm.put("B", r.nextInt(100));
		tm.put("E", r.nextInt(100));
		
		System.out.println("TreeMap的键值对个数:"+tm.size());
		
		//打印treemap，默认构造函数，treemap按照key的大小进行排序
		System.out.println("TreeMap:"+tm);
		
		//打印treemap的:键值对的set集合、键的set集合、值的set集合
		System.out.println("键值对的set集合:"+tm.entrySet());
		System.out.println("键的set集合:"+tm.keySet());
		System.out.println("值的set集合:"+tm.values());
		
		//打印treemap的第一个键值对
		System.out.println("TreeMap的第一个键值对:"+tm.firstEntry());
		
		//ceilingkey(key)返回treemap中大于等于key的最小的key，否则返回null
		System.out.println("大于等于key=G对应的key:"+tm.ceilingKey("G"));
		
		//clone treemap
		System.out.println("TreeMap的clone:"+tm.clone());
		
		//treemap的反向map
		System.out.println("TreeMap的反向map:"+tm.descendingMap());
		
		//删除制定键值的entry并打印
		tm.remove("C");
		System.out.println("TreeMap:"+tm);
		
		//清空treemap
		tm.clear();
		
		//判断treemap是否为空
		System.out.println("Is empty? "+tm.isEmpty());	
	}
	
	
	/**
     * 测试TreeMap的子Map函数
     */
    public static void testSubMapAPIs() {
        // 新建TreeMap
        TreeMap tmap = new TreeMap();
        // 添加“键值对”
        tmap.put("a", 101);
        tmap.put("b", 102);
        tmap.put("c", 103);
        tmap.put("d", 104);
        tmap.put("e", 105);

        System.out.printf("\n ---- testSubMapAPIs ----\n");
        // 打印出TreeMap
        System.out.printf("tmap:\n\t%s\n", tmap);

        // 测试 headMap(K toKey),tokey前面的键值对(不包括自身)
        System.out.printf("tmap.headMap(\"c\"):\n\t%s\n", tmap.headMap("c"));
        // 测试 headMap(K toKey, boolean inclusive)，tokey前面的键值对，true包括自身,false包括自身
        System.out.printf("tmap.headMap(\"c\", true):\n\t%s\n", tmap.headMap("c", true));
        System.out.printf("tmap.headMap(\"c\", false):\n\t%s\n", tmap.headMap("c", false));

        // 测试 tailMap(K fromKey)，formkey后边的键值对(不包括自身)
        System.out.printf("tmap.tailMap(\"c\"):\n\t%s\n", tmap.tailMap("c"));
        // 测试 tailMap(K fromKey, boolean inclusive)tokey后面的键值对，true包括自身,false包括自身
        System.out.printf("tmap.tailMap(\"c\", true):\n\t%s\n", tmap.tailMap("c", true));
        System.out.printf("tmap.tailMap(\"c\", false):\n\t%s\n", tmap.tailMap("c", false));
   
        // 测试 subMap(K fromKey, K toKey)
        System.out.printf("tmap.subMap(\"a\", \"c\"):\n\t%s\n", tmap.subMap("a", "c"));
        // 测试 
        System.out.printf("tmap.subMap(\"a\", true, \"c\", true):\n\t%s\n", 
                tmap.subMap("a", true, "c", true));
        System.out.printf("tmap.subMap(\"a\", true, \"c\", false):\n\t%s\n", 
                tmap.subMap("a", true, "c", false));
        System.out.printf("tmap.subMap(\"a\", false, \"c\", true):\n\t%s\n", 
                tmap.subMap("a", false, "c", true));
        System.out.printf("tmap.subMap(\"a\", false, \"c\", false):\n\t%s\n", 
                tmap.subMap("a", false, "c", false));

        // 测试 navigableKeySet()
        System.out.printf("tmap.navigableKeySet():\n\t%s\n", tmap.navigableKeySet());
        // 测试 descendingKeySet()
        System.out.printf("tmap.descendingKeySet():\n\t%s\n", tmap.descendingKeySet());
    }

    /**
     * 测试TreeMap的导航函数
     */
    public static void testNavigableMapAPIs() {
        // 新建TreeMap
        NavigableMap nav = new TreeMap();
        // 添加“键值对”
        nav.put("aaa", 111);
        nav.put("bbb", 222);
        nav.put("eee", 333);
        nav.put("ccc", 555);
        nav.put("ddd", 444);

        System.out.printf("\n ---- testNavigableMapAPIs ----\n");
        // 打印出TreeMap
        System.out.printf("Whole list:%s%n", nav);

        // 获取第一个key、第一个Entry
        System.out.printf("First key: %s\tFirst entry: %s%n",nav.firstKey(), nav.firstEntry());

        // 获取最后一个key、最后一个Entry
        System.out.printf("Last key: %s\tLast entry: %s%n",nav.lastKey(), nav.lastEntry());

        // 获取“小于/等于bbb”的最大键值对
        System.out.printf("Key floor before bbb: %s%n",nav.floorKey("bbb"));

        // 获取“小于bbb”的最大键值对
        System.out.printf("Key lower before bbb: %s%n", nav.lowerKey("bbb"));

        // 获取“大于/等于bbb”的最小键值对
        System.out.printf("Key ceiling after ccc: %s%n",nav.ceilingKey("ccc"));

        // 获取“大于bbb”的最小键值对
        System.out.printf("Key higher after ccc: %s%n\n",nav.higherKey("ccc"));
    }

}
