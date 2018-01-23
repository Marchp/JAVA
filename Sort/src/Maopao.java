import java.util.Scanner;

public class Maopao{
public static void main(String [] args){
  Scanner read = new Scanner(System.in); //创建Scanner对象read 接受从控制台输入
  int  n; //元素个数
  System.out.println("请输入数组元素个数");
  n = read.nextInt(); //调用Scanner类中的方法.nextInt() 对象名.方法名
  int [ ] arr= new int[n];
  int i,j;
  for(i = 0;i<arr.length; i ++ ){  //一般都用for循环进行数组元素从键盘输入          
       arr[i] = read.nextInt();  //调用Scanner类中的方法.nextInt() 对象名.方法名 
  }
   fun(arr);
}
   public static void  fun(int [] array){
    int j,k,t;
     t=0;
     for(j=0;j<array.length-1;j++){ //控制比较的轮数 n个数比较n-1轮
      for(k=0;k<array.length-1-j;k++)
      { //控制每轮比较的次数
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