import java.util.Scanner;

public class Maopao{
public static void main(String [] args){
  Scanner read = new Scanner(System.in); //����Scanner����read ���ܴӿ���̨����
  int  n; //Ԫ�ظ���
  System.out.println("����������Ԫ�ظ���");
  n = read.nextInt(); //����Scanner���еķ���.nextInt() ������.������
  int [ ] arr= new int[n];
  int i,j;
  for(i = 0;i<arr.length; i ++ ){  //һ�㶼��forѭ����������Ԫ�شӼ�������          
       arr[i] = read.nextInt();  //����Scanner���еķ���.nextInt() ������.������ 
  }
   fun(arr);
}
   public static void  fun(int [] array){
    int j,k,t;
     t=0;
     for(j=0;j<array.length-1;j++){ //���ƱȽϵ����� n�����Ƚ�n-1��
      for(k=0;k<array.length-1-j;k++)
      { //����ÿ�ֱȽϵĴ���
              if(array[k]<array[k+1])
              {
                        t=array[k];
                         array[k]=array[k+1];
                         array[k+1]=t;
      }
    }
 }
  for(int i=0;i<array.length;i++){
          System.out.print(array[i]+" ");
 }
 System.out.println();
  }
}