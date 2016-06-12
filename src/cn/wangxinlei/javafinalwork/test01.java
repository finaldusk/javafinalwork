//1.定义一个矩形类,包括长(lengh)宽(width)两个属性,带参数的构造方法和计算面积方法findarea,编写测试类,创建两个对象,分别调用计算两个对象的面积的方法.

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
