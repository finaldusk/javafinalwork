//15.дһ����ΪCuboid�����ʾ�����塣������Ϊ�������ߡ���������һ���������ģ����������ķ���findArea,��������ķ���findVol,�Ƚ������С�ķ���compareдһ����������Cuboid�ࡣ�ڲ������д�������Cuboid�Ķ��󡣸�������������ĳ������ߣ���ʾ����������Եı��������ʾ����ϴ�ĳ�����������

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