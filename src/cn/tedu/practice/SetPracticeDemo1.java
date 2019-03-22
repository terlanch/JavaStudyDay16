package cn.tedu.practice;

import java.util.HashSet;

public class SetPracticeDemo1 {
	public static void main(String[] args) {
		HashSet books = new HashSet();
		//分别向books集合中添加两个A对象，两个B对象，两个C对象
		books.add(new A());
		books.add(new A());
		
		books.add(new B());
		books.add(new B());
		
		books.add(new C());
		books.add(new C());
		
		System.out.println(books);
	}
}

class A{
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}

class B{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
}

class C{
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}