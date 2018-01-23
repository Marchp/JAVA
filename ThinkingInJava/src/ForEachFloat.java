import java.util.*;

public class ForEachFloat {
	public static void main(String [] args){
		//定义随机数的时候定义一个seed，例如47，可以保持每次运行时产生的随机数是相同的(只要是一个数就可以。是不是47都行)
		Random r=new Random(47);
		float f[]=new float[10];
		for(int i=0;i<10;i++)
			f[i]=r.nextFloat();
		for(float x:f)//foreach语法。定义一个float类型的变量x，并将数组中的每一个 f赋值给x
			System.out.println(x);		
		//foreach语句多用于数组
		for(char c:"I am not your father".toCharArray())
			System.out.print(c+" ");		
	}

}
