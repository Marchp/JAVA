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
		System.out.println("��������Ҫ�����������������:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		insertsort(a);
	}
	
	public static void print(int []a){
		System.out.println("�������������������:");
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
			a[j]=temp;//���������㷨
		}
	    print(a);
	}
}
