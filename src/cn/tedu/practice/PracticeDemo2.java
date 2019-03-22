package cn.tedu.practice;

import java.util.Scanner;

public class PracticeDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chs = str.toCharArray();
		int i = 1;
		int num = 1;
		
		for(int j = 1;j<chs.length;j++){
			i++;
			if(chs[j] == chs[j-1]){
				i = 1;
			}
			num = Math.max(num, i);
		}
		System.out.println(num);
	}
}
