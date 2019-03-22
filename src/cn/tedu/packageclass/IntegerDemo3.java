package cn.tedu.packageclass;
/*
 * 将字符串转换为基本数据类型
 * 直接使用对应包装类的构造方法即可
 * Boolean类型，如果传入的不是true（忽视大小写）就返回false
 * Character类型，没有对应的字符串作为参数的构造方法
 * 
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		//将字符串转换为基本数据类型
		//new Integer(String s)这个构造方法的参数必须是
		//数字或者- + 其他字符一律出异常
		Integer in = new Integer("123");
		System.out.println(in);
		
		Double dou = new Double("3.14");
		System.out.println(dou);
		
		//如果参数不是true（忽视大小写），就返回false
		Boolean b = new Boolean("0");
		System.out.println(b);
		
		//没有
//		Character c = new Character("");
	}
}
