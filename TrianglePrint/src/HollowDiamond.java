/**
 * name HollowDiamond
 * Description print a hollow diamond
 * @author Marchp
 * @version 24 january 2018
 */
public class HollowDiamond{
    public static void main(String[] args) {
        print(11); // 
    }

    public static void print(int size) {
        if (size % 2 == 0) {
            size++; // �������δ�С
        }
        boolean isfirstorend = false;
        int i;
        int j;
        //ͼ���ϲ���
        for (i = 0; i < size / 2 + 1; i++) {
             isfirstorend = false;
            for (j = 0; j < size / 2 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
                isfirstorend = true;
            }
            if (isfirstorend) {// �ж��Ƿ��ǵ�һ��
                System.out.print("*");
            }
            System.out.println();
        }
        //ͼ���²���
        for (i = 0; i < size / 2; i++) {
            isfirstorend = false;
            for (j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * (size / 2 - i - 1) - 1; j++) {
                System.out.print(" ");
                isfirstorend = true;
            }
            if(isfirstorend){// �ж��Ƿ������һ��
            System.out.print("*");
            }
            System.out.println();
        }
    }
}