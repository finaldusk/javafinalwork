//4.��д�������һ����ʾ�����ε���trival�����е����԰��������εĵף�di���ߣ�gao��������������Ĭ�Ϲ��췽����Ϊdi��gao�ƶ���ֵ�Ĺ��췽������������������ķ���findarea��������д�����࣬��������������

package cn.wangxinlei.javafinalwork;

public class test04 {

	public static void main(String[] args) {
		trival t1=new trival(3,4);
		System.out.println(t1.findarea());
	}

}
class trival {
	double di;
	double gao;
	public trival() {
		di=0;
		gao=0;
	}
	public trival(double di, double gao) {
		this.di = di;
		this.gao = gao;
	}
	public double findarea(){
		return di*gao*0.5;
	}
}
