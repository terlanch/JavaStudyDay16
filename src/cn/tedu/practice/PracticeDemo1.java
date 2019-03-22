package cn.tedu.practice;

import java.util.Scanner;

public class PracticeDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		//创建一个新的字符数组来储存新的字符
		char[] chs = new char[str1.length()*2];
		for(int i = 0;i<chs.length;i++){
			if(i%2 != 0){
				//在新数组的奇数索引倒序插入str2
				chs[i] = str2.charAt(str2.length()-(i+1)/2);
			}else{
				//在新数组的偶说索引正序插入str1
				chs[i] = str1.charAt(i/2);
			}
			
		}
		String str3 = new String(chs);
		System.out.println(str3);
	}
}
