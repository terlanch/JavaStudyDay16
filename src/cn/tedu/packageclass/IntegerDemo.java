package cn.tedu.packageclass;
/*
 * int ---- Integer
 * double ---- Double
 * 
 * װ�䣺��������������ת��Ϊ������������
 * JDK1.5������ �Զ�װ�䣺�Զ���������������ת��Ϊ������������
 * �Զ�װ��ײ���õ���.valueOf��������
 * ��-128��127֮���Integer���Ƚ�ֵ����ȵģ���cache
 * ������ֱ��ȡ��ͬһ�����󡣳�����Χ����newһ������
 * 
 * Byte��valueOf��Զ�Ƿ��������ͬһ������
 * 
 * Short��valueOf��-128��127֮�䷵��ͬһ�����󣬳�����Χ�����µĶ���
 * 
 * Long��valueOf��-128��127֮�䷵��ͬһ�����󣬳�����Χ�����µĶ���
 * 
 * Float��Doubleֱ�Ӵ����µĶ���
 * 
 * Boolean �ͷ�������ֵTURE ����FALSE
 * 
 * Character ��valueOfС�ڵ���127����ͬһ�����󣬳�����Χ�����µĶ���
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int a = 10;
		Integer in = new Integer(a);
		System.out.println(in);
		
		double d = 3.14;
		Double dou = new Double(d);
		System.out.println(dou);
		//Integer������д��equals���� ��ʾ�Ƚ�ֵ  
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
		
		
		
		//�Զ�װ��
		Byte by = 10;
		
		Short sh = 100;
		
		Long lo = 100L;
		
		Float fl = 2.56F;
		
		Double dou1 = 3.14;
		
		Boolean bl = true;
		
		Character cha = 'c';
	}

}
