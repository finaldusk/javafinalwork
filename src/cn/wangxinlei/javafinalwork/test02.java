//2.������Ʒ��goods����������unitPrice������account�������ԣ����������۸���㷽��totalprice������д��������ԡ�

package cn.wangxinlei.javafinalwork;

public class test02 {

	public static void main(String[] args) {
		goods g1=new goods(6088,12);
		goods g2=new goods(699.99,19);
		System.out.println(g1.totalprice());
		System.out.println(g2.totalprice());
	}
}
class goods{
	private double unitPrice;
	private int account;
	public goods(double unitPrice, int account) {
		this.unitPrice = unitPrice;
		this.account = account;
	}
	public double totalprice(){
		return unitPrice*account;
	}
	
}