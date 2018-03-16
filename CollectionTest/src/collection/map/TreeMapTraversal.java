package collection.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/*
 * @desc ����TreeMap�Ĳ��Գ���
 *   (01) ͨ��entrySet()ȥ����key��value���ο�ʵ�ֺ�����
 *        iteratorTreeMapByEntryset()
 *   (02) ͨ��keySet()ȥ����key��value���ο�ʵ�ֺ�����
 *        iteratorTreeMapByKeyset()
 *   (03) ͨ��values()ȥ����value���ο�ʵ�ֺ�����
 *        iteratorTreeMapJustValues()
 *
 * @author skywang
 */
public class TreeMapTraversal {

    public static void main(String[] args) {
        int val = 0;
        String key = null;
        Integer value = null;
        Random r = new Random();
        TreeMap map = new TreeMap();

        for (int i=0; i<12; i++) {
            // �����ȡһ��[0,100)֮�������
            val = r.nextInt(100);
            
            key = String.valueOf(val);
            value = r.nextInt(5);
            // ��ӵ�TreeMap��
            map.put(key, value);
            System.out.println(" key:"+key+" value:"+value);
        }
        // ͨ��entrySet()����TreeMap��key-value
        iteratorTreeMapByEntryset(map) ;
        
        // ͨ��keySet()����TreeMap��key-value
        iteratorTreeMapByKeyset(map) ;
        
        // ��������TreeMap��value
        iteratorTreeMapJustValues(map);        
    }
    
    /*
     * ͨ��entry set����TreeMap
     * Ч�ʸ�!
     */
    private static void iteratorTreeMapByEntryset(TreeMap map) {
        if (map == null)
            return ;

        System.out.println("\niterator TreeMap By entryset");
        String key = null;
        Integer integ = null;
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            
            key = (String)entry.getKey();
            integ = (Integer)entry.getValue();
            System.out.println(key+" -- "+integ.intValue());
        }
    }

    /*
     * ͨ��keyset������TreeMap
     * Ч�ʵ�!
     */
    private static void iteratorTreeMapByKeyset(TreeMap map) {
        if (map == null)
            return ;

        System.out.println("\niterator TreeMap By keyset");
        String key = null;
        Integer integ = null;
        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            key = (String)iter.next();
            integ = (Integer)map.get(key);
            System.out.println(key+" -- "+integ.intValue());
        }
    }
    

    /*
     * ����TreeMap��values
     */
    private static void iteratorTreeMapJustValues(TreeMap map) {
        if (map == null)
            return ;
        
        Collection c = map.values();
        Iterator iter= c.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
       }
    }
}
