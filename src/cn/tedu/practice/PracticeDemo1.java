package cn.tedu.practice;

import java.util.Scanner;

public class PracticeDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		//����һ���µ��ַ������������µ��ַ�
		char[] chs = new char[str1.length()*2];
		for(int i = 0;i<chs.length;i++){
			if(i%2 != 0){
				//������������������������str2
				chs[i] = str2.charAt(str2.length()-(i+1)/2);
			}else{
				//���������ż˵�����������str1
				chs[i] = str1.charAt(i/2);
			}
			
		}
		String str3 = new String(chs);
		System.out.println(str3);
	}
}
