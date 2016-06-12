//14.编写一个类，描述桌子，包括以下几种属性：长，宽，高，颜色。并且使该类具有这样的功能：在定制桌子（即创建桌子对象）时，就可以同时指定桌子的长，宽，高来定制。也可以同时指定长，宽，高颜色来定制，也可单独指定桌子颜色来定制。并编写一个测试类测试这几种定制方法。

package cn.wangxinlei.javafinalwork;

public class test14 {

	public static void main(String[] args) {
		table t1=new table("猫屎色");
		table t2=new table(1.2,3.4,5.8);
		table t3=new table(1.2,3.4,5.8,"猫屎色");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}

}
class table{
	private double width=1;
	private double height=1;
	private double length=1;
	private String color="屎黄色";
	
	
	public table(double width, double height, double length, String color) {
		this.width = width;
		this.height = height;
		this.length = length;
		this.color = color;
	}


	public table(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}


	public table(String color) {
		this.color = color;
	}


	public String toString() {
		return "table [width=" + width + ", height=" + height + ", length=" + length + ", color=" + color + "]";
	}
	
}