//6.����һ���յ��࣬������Ʒ�ƣ�String����״̬��int���������ԣ����޲κ��вε��������췽������д�����࣬���������յ�����

package cn.wangxinlei.javafinalwork;

public class test06 {

	public static void main(String[] args) {
		aircondition a1=new aircondition();
		aircondition a2=new aircondition("����",1);
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