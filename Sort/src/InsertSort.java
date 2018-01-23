/**
 * insertion sort Algorithm
 * @name  insertsort;
 * @author March;
 * @version 29 August  2017;
 */
import java.util.Scanner;

public class InsertSort {

	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		int [] a=new int[10];
		System.out.println("请输入需要进行排序的数字序列:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		insertsort(a);
	}
	
	public static void print(int []a){
		System.out.println("请输出排序后的数字序列:");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}		
    }
	
	public static void insertsort( int []a)
	{	
		for(int i=1;i<a.length;i++)
		{
			int j=i;
			int temp=a[i];
			while(j>0 && temp<a[j-1]){
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;//插入排序算法
		}
	    print(a);
	}
}
