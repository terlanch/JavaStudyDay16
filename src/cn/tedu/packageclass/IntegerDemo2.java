package cn.tedu.packageclass;

public class IntegerDemo2 {
	public static void main(String[] args) {
		
	
	//���䣺��������������ת��Ϊ������������
	Integer in = new Integer(10);
	//�ײ���õ���.intValue����
	int a = in.intValue();
	
	Double dou = new Double(3.14);
	double d = dou.doubleValue();
	
	
	//�Զ����䣺��������������ת��Ϊ������������
	Integer in1 = new Integer(20);
	//������XXXValue();
	int i = in1;
	
	Integer in2 = 1000;
	int i1 = 1000;
	//���b� �ڽ��бȽ�ʱ �Զ�����
	System.out.println(in2 == i1);
	}
}
