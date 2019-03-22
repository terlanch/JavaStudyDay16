package cn.tedu.packageclass;
/*
 * int ---- Integer
 * double ---- Double
 * 
 * 装箱：将基本数据类型转换为引用数据类型
 * JDK1.5的特性 自动装箱：自动将基本数据类型转换为引用数据类型
 * 自动装箱底层调用的是.valueOf（）方法
 * 在-128到127之间的Integer，比较值是相等的，从cache
 * 数组中直接取出同一个对象。超出范围重新new一个对象
 * 
 * Byte的valueOf永远是返回数组的同一个对象
 * 
 * Short的valueOf在-128到127之间返回同一个对象，超出范围创建新的对象
 * 
 * Long的valueOf在-128到127之间返回同一个对象，超出范围创建新的对象
 * 
 * Float和Double直接创建新的对象
 * 
 * Boolean 就返回两个值TURE 或者FALSE
 * 
 * Character 的valueOf小于等于127返回同一个对象，超出范围创建新的对象
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int a = 10;
		Integer in = new Integer(a);
		System.out.println(in);
		
		double d = 3.14;
		Double dou = new Double(d);
		System.out.println(dou);
		//Integer类里重写了equals方法 表示比较值  
//		Integer in1 = new Integer(98);
//		Integer in2 = new Integer(98);
//		System.out.println(in1 == in2);//false
//		System.out.println(in1.equals(in2));//true
		
//		Integer in1 = new Integer(198);
//		Integer in2 = new Integer(198);
//		System.out.println(in1 == in2);//false
//		System.out.println(in1.equals(in2));//true
		
//		Integer in1 = 98;
//		Integer in2 = 98;
//		System.out.println(in1 == in2);//true
//		System.out.println(in1.equals(in2));//true
		
		Integer in1 = 198;
		Integer in2 = 198;
		System.out.println(in1 == in2);//false
		System.out.println(in1.equals(in2));//true
		
		
		
		//自动装箱
		Byte by = 10;
		
		Short sh = 100;
		
		Long lo = 100L;
		
		Float fl = 2.56F;
		
		Double dou1 = 3.14;
		
		Boolean bl = true;
		
		Character cha = 'c';
	}

}
