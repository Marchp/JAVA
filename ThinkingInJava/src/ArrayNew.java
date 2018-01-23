import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String [] args){
		int []a;
		Random  r=new Random(47);
		a=new int[r.nextInt(20)];
		System.out.println(a.length);
		//数组的基本类型会自动初始化成空值，数字与字符就是0，布尔值就是false
		System.out.println(Arrays.toString(a));
	}

}
