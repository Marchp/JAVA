package collection.map;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

/*
 * @desc Hashtable的测试程序。
 *
 * @author Marchp
 */
public class HashTableAPITest {
    public static void main(String[] args) {
        testHashtableAPIs();
    }

    private static void testHashtableAPIs() {
        // 初始化随机种子
        Random r = new Random();
        // 新建Hashtable
        Hashtable table = new Hashtable();
        // 添加操作
        table.put("one",r.nextInt(10));
        table.put("two", r.nextInt(10));
        table.put("three", r.nextInt(10));

        // 打印出table(注意hashtable不是一个有序集合，故输出没有固定的顺序)
        System.out.println("table:"+table );


        // Hashtable的键值对个数        
        System.out.println("size:"+table.size());

        // containsKey(Object key) :是否包含键key
        System.out.println("contains key two : "+table.containsKey("two"));
        System.out.println("contains key five : "+table.containsKey("five"));

        // containsValue(Object value) :是否包含值value
        System.out.println("contains value 0 : "+table.containsValue(new Integer(0)));

        //返回所有value对象的枚举类型
        Enumeration e=table.elements();
   
        System.out.print("enumeration:"); 
        while (e.hasMoreElements()) {
           System.out.print(" "+e.nextElement());
        }
        System.out.println();
   
        // remove(Object key) ： 删除键key对应的键值对
        table.remove("three");

        System.out.println("table:"+table );

        // clear() ： 清空Hashtable
        table.clear();
        

        // isEmpty() : Hashtable是否为空
        System.out.println((table.isEmpty()?"table is empty":"table is not empty") );
    }

}