/**
 * bubble sort Algorithm
 * @name  bubblesort;
 * @author March;
 * @version 27 August 2017;
 */
import java.util.Scanner;

public class BubbleSort {
	public static void main(String []args)
	{
		
		Scanner s=new Scanner(System.in);
		int []a=new int [10];
		System.out.println("��������Ҫ�����������������:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		function(a);
	}
	
	public static void  function(int [] a)
    { 
		int temp=0;
		//ѭ���Ƚ�ǰ����ֵ��СӦע�ⲻҪ��������Խ��
		for(int j=0;j<10-1;j++)//
		{
		    for(int i=0;i<10-1-j;i++)//
		    {
			    if(a[i]>a[i+1])
		     	{
			     	temp=a[i];
				    a[i]=a[i+1];
			    	a[i+1]=temp;			
			    }
		    }
		}
		print(a);
    }
	
	public static  void print(int [] a){
		System.out.println("�������������������:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}		
    }
}
