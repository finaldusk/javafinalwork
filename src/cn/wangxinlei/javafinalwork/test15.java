//15.写一个名为Cuboid的类表示立方体。数据域为长，宽，高。方法包括一个带参数的，计算表面积的方法findArea,计算体积的方法findVol,比较体积大小的方法compare写一个类来测试Cuboid类。在测试类中创建两个Cuboid的对象。给两个对象任意的长，宽，高，显示两个对象各自的表面积，显示体积较大的长方体的体积。

package cn.wangxinlei.javafinalwork;

public class test15 {

	public static void main(String[] args) {
		Cuboid c1=new Cuboid(1,2,3);
		Cuboid c2=new Cuboid(2,3,4);
		System.out.println(c1.findArea());
		System.out.println(c2.findArea());
		System.out.println(c1.findVol()>c2.findVol()?c1.findVol():c2.findVol());

	}

}

class Cuboid{
	private double width;
	private double height;
	private double length;
	public Cuboid(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	public double findArea(){
		return (width*height+height*length+length*width)*2;
	}
	public double findVol(){
		return width*height*length;
	}
}