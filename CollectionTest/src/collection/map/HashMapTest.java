package collection.map;

import java.util.HashMap;
import java.util.Random;

/*
 * @desc HashMap���Գ���
 *        
 * @author Marchp
 */
public class HashMapTest {

    public static void main(String[] args) {
        testHashMapAPIs();
    }
    
    private static void testHashMapAPIs() {
        // ��ʼ���������
        Random r = new Random();
        // �½�HashMap
        HashMap map = new HashMap();
        // ��Ӳ���
        map.put("one", r.nextInt(10));
        map.put("two", r.nextInt(10));
        map.put("three", r.nextInt(10));

        // ��ӡ��map
        System.out.println("map:"+map );

        // HashMap�ļ�ֵ�Ը���        
        System.out.println("size:"+map.size());

        // containsKey(Object key) :�Ƿ������key
        System.out.println("contains key two : "+map.containsKey("two"));
        System.out.println("contains key five : "+map.containsKey("five"));

        // containsValue(Object value) :�Ƿ����ֵvalue
        System.out.println("contains value 0 : "+map.containsValue(new Integer(0)));

        // remove(Object key) �� ɾ����key��Ӧ�ļ�ֵ��
        map.remove("three");

        System.out.println("map:"+map );

        // clear() �� ���HashMap
        map.clear();

        // isEmpty() : HashMap�Ƿ�Ϊ��
        System.out.println((map.isEmpty()?"map is empty":"map is not empty") );
    }
}