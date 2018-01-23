import java.util.*;
public class VowelsAndConsonants {
	public static void main(String [] args){
		Random r=new Random(47);
		for(int i=0;i<50;i++){
			int c=r.nextInt(26)+'a';
			System.out.print((char)c+"."+c+":");
			switch(c){
			case 'a':
			case 'o':
			case 'e':
			case 'i':
			case 'u':System.out.println("vowel");
			         break;
			case 'y':
			case 'W':System.out.println("sometimes a vowel");
			         break;
			default :System.out.println("consonant");
			}
			
		}
	}

}
