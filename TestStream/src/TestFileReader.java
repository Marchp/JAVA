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
			System.out.println("һ����ȡ��"+num+"���ַ�");
		} catch (FileNotFoundException e){
			System.out.println("�Ҳ���ָ���ļ�!");
        } catch (IOException e){
			System.out.println("�ļ���ȡ����!");
		}
		
	}
}
