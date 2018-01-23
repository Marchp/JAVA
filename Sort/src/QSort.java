import java.util.Scanner;
/**
 * quick sort Algorithm
 * @name  quicksort;
 * @author March;
 * @version 28 August  2017;
 */
public class QSort {
	public static void main(String [] args){
		quicksort qs=new quicksort();
		Scanner sc=new Scanner(System.in);
		int data[] =new int[10];//{14,58,41,21,10,13,56,25,47,12,19};
		System.out.println("输入需要进行排序的数字序列:");
		for(int i=0;i<data.length;i++)
		{
			data[i]=sc.nextInt();
		}
		qs.data=data;
		qs.sort(0,qs.data.length-1);
		qs.display();
	}
}
	
    class quicksort
	{
		public int data[];
		private int partition(int sortArray[],int low,int high)
		{
			int key=sortArray[low];
			while(low<high)
			{
				while(low<high && sortArray[high]>=key)				
				    high--;
				    sortArray[low]=sortArray[high];
			    while(low<high && sortArray[low]<=key)
			    	low++;
					sortArray[high]=sortArray[low];
			       
			}
			sortArray[low]=key;
		    return low;
		}
		
		public void sort(int low,int high)
		{
			if(low<high)
			{
				int result=partition(data,low,high);
				sort(low,result-1);
				sort(result+1,high);	
			}
		}
		
		public void display()
		{
			System.out.println("输出经过快速排序之后的数字序列:");
			for(int i=0;i<data.length;i++)
			{
				System.out.print(data[i]+" ");
			}
		}
	}


