package cn.tedu.practice;

public class practice02 {
	public static void main(String[] args) {
		String str = "aasssddddggggg";
		int n = 0;
		while(str.length() != 0){
			//获取原数组的长度
			int oldLength = str.length();
			char c = str.charAt(0);
			
			str = str.replaceAll(c+"", "");
			n = oldLength-str.length();
			System.out.println(c+"出现了"+n+"次");
		}
	}
}
