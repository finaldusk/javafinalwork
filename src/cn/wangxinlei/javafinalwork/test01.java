//1.����һ��������,������(lengh)��(width)��������,�������Ĺ��췽���ͼ����������findarea,��д������,������������,�ֱ���ü����������������ķ���.

package cn.wangxinlei.javafinalwork;

public class test01 {

	public static void main(String[] args) {
		rectangle r1=new rectangle(10.5,20);
		rectangle r2=new rectangle(123,234.23);
		System.out.println(r1.findarea());
		System.out.println(r2.findarea());
	}
}

class rectangle{
	private double length;
	private double width;
	
	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double findarea(){
		return length*width;
	}
}
