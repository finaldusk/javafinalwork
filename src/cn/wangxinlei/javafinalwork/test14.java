//14.��дһ���࣬�������ӣ��������¼������ԣ��������ߣ���ɫ������ʹ������������Ĺ��ܣ��ڶ������ӣ����������Ӷ���ʱ���Ϳ���ͬʱָ�����ӵĳ������������ơ�Ҳ����ͬʱָ������������ɫ�����ƣ�Ҳ�ɵ���ָ��������ɫ�����ơ�����дһ������������⼸�ֶ��Ʒ�����

package cn.wangxinlei.javafinalwork;

public class test14 {

	public static void main(String[] args) {
		table t1=new table("èʺɫ");
		table t2=new table(1.2,3.4,5.8);
		table t3=new table(1.2,3.4,5.8,"èʺɫ");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}

}
class table{
	private double width=1;
	private double height=1;
	private double length=1;
	private String color="ʺ��ɫ";
	
	
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