import java.io.*;
public class TestFileReader {

	public static void main(String [] args)
	{
		int a=0;
		FileReader fr=null;
		try{
			fr=new FileReader("F:\\java-oxygen\\WorkSpace\\Sort\\src\\BubbleSort.java");
			int num=0;
			while((a=fr.read())!=-1){
			System.out.println((char)a);
			num++;
			}
			fr.close();
			System.out.println("一共读取了"+num+"个字符");
		} catch (FileNotFoundException e){
			System.out.println("找不到指定文件!");
        } catch (IOException e){
			System.out.println("文件读取错误!");
		}
		
	}
}
