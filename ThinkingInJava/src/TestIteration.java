/**
 * while ��������  from <<Thinking in Java>>
 * @name  TestIterstion;
 * @author March;
 * @version 12 Sept 2017;
 */
public class TestIteration {
	public static void main(String [] args){
		while(Condition()){
			System.out.println("inside'while'");	
		}
		System.out.println("outside'while'");
	}

	private static boolean Condition(){
		boolean result=Math.random()<0.99;//Math.random()����0-1֮���һ������������ڵ���0С��1
		System.out.println(result+" ");
		return result;
	}
}
