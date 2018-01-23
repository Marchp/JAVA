
public class Overflow {
	public static void main(String [] args){
		int a=Integer.MAX_VALUE;
		int b=a*2;
		//足够大的int结果溢出
		System.out.println("a="+a+"   "+"b="+b);
	}

}
