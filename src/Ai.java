
//AI���Ĵ��룬��ֵ1����

import java.util.Scanner;

public class Ai{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while(true) {
			str = sc.next();
			str = str.replace("��","");
			str = str.replace("��", "��");
			str = str.replace("�� ", "��");
			System.out.println(str);
		}
		
	}
}