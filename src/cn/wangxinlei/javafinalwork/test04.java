//4.编写程序设计一个表示三角形的类trival。期中的属性包括三角形的底（di）高（gao），方法包括：默认构造方法，为di和gao制定初值的构造方法，计算三角形面积的方法findarea（）。编写测试类，输出三角形面积。

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
