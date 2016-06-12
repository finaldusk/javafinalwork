//6.定义一个空调类，该类有品牌（String）和状态（int）两个属性，有无参和有参的两个构造方法。编写测试类，创建两个空调对象。

package cn.wangxinlei.javafinalwork;

public class test06 {

	public static void main(String[] args) {
		aircondition a1=new aircondition();
		aircondition a2=new aircondition("三菱",1);
		System.out.println(a1);
		System.out.println(a2);
	}
}

class aircondition{
	private String brand;
	private int state;
	public aircondition() {
		brand=null;
		state=0;
	}
	public aircondition(String brand, int state) {
		this.brand = brand;
		this.state = state;
	}
	public String toString() {
		return "aircondition [brand=" + brand + ", state=" + state + "]";
	}
	
}