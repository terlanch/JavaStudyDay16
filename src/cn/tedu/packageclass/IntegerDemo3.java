package cn.tedu.packageclass;
/*
 * ���ַ���ת��Ϊ������������
 * ֱ��ʹ�ö�Ӧ��װ��Ĺ��췽������
 * Boolean���ͣ��������Ĳ���true�����Ӵ�Сд���ͷ���false
 * Character���ͣ�û�ж�Ӧ���ַ�����Ϊ�����Ĺ��췽��
 * 
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		//���ַ���ת��Ϊ������������
		//new Integer(String s)������췽���Ĳ���������
		//���ֻ���- + �����ַ�һ�ɳ��쳣
		Integer in = new Integer("123");
		System.out.println(in);
		
		Double dou = new Double("3.14");
		System.out.println(dou);
		
		//�����������true�����Ӵ�Сд�����ͷ���false
		Boolean b = new Boolean("0");
		System.out.println(b);
		
		//û��
//		Character c = new Character("");
	}
}
