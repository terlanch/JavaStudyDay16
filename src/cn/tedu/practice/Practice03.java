package cn.tedu.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//��ȡstr�ĳ���
		int oldLength = str.length();
		
		//ȥ������
		String str1 = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str1);
		int newLength = str1.length();
		System.out.println(oldLength/newLength);
	}

}
