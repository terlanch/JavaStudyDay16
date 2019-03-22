package cn.tedu.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.replaceAll("[^0-9]", "");
		
		char[] chs = str.toCharArray();
		Arrays.sort(chs);
		System.out.println(chs);
		
	}
}
