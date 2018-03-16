package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversal {
	public void arrayListTraversal(List<Integer> lists) {
		/* ��һ�ֱ�����ʽ */
		System.out.print("forѭ���ı�����ʽ��");
		for (int i = 0; i < lists.size(); i++) {
			System.out.print(lists.get(i));
		}
		System.out.println();

		/* �ڶ��ֱ�����ʽ */
		System.out.print("foreach�ı�����ʽ��");
		for (Integer list : lists) {
			System.out.print(list);
		}
		System.out.println();

		/* �����ֱ�����ʽ */
		System.out.print("Iterator�ı�����ʽ��");
		for (Iterator<Integer> list = lists.iterator(); list.hasNext();) {
			System.out.print(list.next());
		}
		System.out.println();

		/* �����ֱ�����ʽ */
		System.out.print("RandomAccess�ı�����ʽ��");
		for (int i = 0; i < lists.size(); i++) {
			System.out.print(lists.get(i));
		}
	}

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<Integer>();
		/* ���Ԫ�� */
		for (int i = 0; i < 10; i++) {
			lists.add(i);
		}
		new ArrayListTraversal().arrayListTraversal(lists);
	}
}