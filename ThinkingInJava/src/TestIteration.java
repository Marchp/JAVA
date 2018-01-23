/**
 * while 迭代测试  from <<Thinking in Java>>
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
		boolean result=Math.random()<0.99;//Math.random()产生0-1之间的一个随机数，大于等于0小于1
		System.out.println(result+" ");
		return result;
	}
}
