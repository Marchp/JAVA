package collection.map;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

/*
 * @desc Hashtable�Ĳ��Գ���
 *
 * @author Marchp
 */
public class HashTableAPITest {
    public static void main(String[] args) {
        testHashtableAPIs();
    }

    private static void testHashtableAPIs() {
        // ��ʼ���������
        Random r = new Random();
        // �½�Hashtable
        Hashtable table = new Hashtable();
        // ��Ӳ���
        table.put("one",r.nextInt(10));
        table.put("two", r.nextInt(10));
        table.put("three", r.nextInt(10));

        // ��ӡ��table(ע��hashtable����һ�����򼯺ϣ������û�й̶���˳��)
        System.out.println("table:"+table );


        // Hashtable�ļ�ֵ�Ը���        
        System.out.println("size:"+table.size());

        // containsKey(Object key) :�Ƿ������key
        System.out.println("contains key two : "+table.containsKey("two"));
        System.out.println("contains key five : "+table.containsKey("five"));

        // containsValue(Object value) :�Ƿ����ֵvalue
        System.out.println("contains value 0 : "+table.containsValue(new Integer(0)));

        //��������value�����ö������
        Enumeration e=table.elements();
   
        System.out.print("enumeration:"); 
        while (e.hasMoreElements()) {
           System.out.print(" "+e.nextElement());
        }
        System.out.println();
   
        // remove(Object key) �� ɾ����key��Ӧ�ļ�ֵ��
        table.remove("three");

        System.out.println("table:"+table );

        // clear() �� ���Hashtable
        table.clear();
        

        // isEmpty() : Hashtable�Ƿ�Ϊ��
        System.out.println((table.isEmpty()?"table is empty":"table is not empty") );
    }

}