package cn.tedu.packageclass;
/*
 * 包装类的哈希码值是固定的
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		
		Double dou = new Double(3.14);
		Double dou1 = new Double(3.14);
		Double dou2 = new Double(3.14);
		System.out.println(in.hashCode());//100
		System.out.println(in1.hashCode());//100
		System.out.println(in2.hashCode());//100
		System.out.println(dou.hashCode());//300063655
		System.out.println(dou1.hashCode());
		System.out.println(dou2.hashCode());
		
		//NaN不是数字和任何值都不相等，包括自身
		System.out.println(0.0 / 0);
		
		//判断结果是不是NaN方式一
		System.out.println(Double.isNaN((0.0 / 0)));
		
		//判断结果是不是NaN方式一
		System.out.println(new Double(0.0 / 0).isNaN());
		
		//负无穷
		System.out.println(-1.0 / 0);
		//正无穷
		System.out.println(1.0 / 0);
		
	}
}	
