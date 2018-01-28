
public class Operator 
{
	public static void main(String[]args)
	{
		int m=5;
		int n=5;
		//逐一声明可以提高程序的可读性
		int x=4;
		int y=4;
		System.out.println("5++"+m+++"  " +"自增运算后的m:"+m);
		System.out.println("++5:"+ ++n+"  " +"自增运算后的n:"+n);
		//前缀方式先运算；后缀方式使用变量原来的值
		System.out.println("4--:"+x--  +"  " +"自减运算后的x:"+x);
		System.out.println("--4:"+--y  +"  " +"自减运算后的y:"+y);
		
		System.out.println(x!=0 && x==y);
		//&&逻辑与运算
		System.out.println(x<=y?"x="+x:"y="+y);
		//唯一三元运算符  condition?expression1:expression2 条件为真时计算第一个表达式，条件为假时计算第二个
		
	}

}
