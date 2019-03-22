package cn.tedu.packageclass;

public class IntegerDemo2 {
	public static void main(String[] args) {
		
	
	//拆箱：将引用数据类型转换为基本数据类型
	Integer in = new Integer(10);
	//底层调用的是.intValue（）
	int a = in.intValue();
	
	Double dou = new Double(3.14);
	double d = dou.doubleValue();
	
	
	//自动拆箱：将引用数据类型转换为基本数据类型
	Integer in1 = new Integer(20);
	//调用了XXXValue();
	int i = in1;
	
	Integer in2 = 1000;
	int i1 = 1000;
	//包裝類 在进行比较时 自动拆箱
	System.out.println(in2 == i1);
	}
}
