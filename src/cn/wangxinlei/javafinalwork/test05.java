//5.编写一个类Teacher,描述教师的课时数量和计算课时的系数，均为double类型。Teacher类还有一个方法compute(),可计算教师的当量课时（课时量*系数），返回值类型为double，所有教师的课时系数相同。编写一个测试类进行测试，创建两个教师对象，计算的系数为1.2，输出计算后的两位教师的当量课时。将系数修改为1.1后，输出修改后的当量课时。

package cn.wangxinlei.javafinalwork;

public class test05 {

	public static void main(String[] args) {
		teacher t1=new teacher(14);
		teacher t2=new teacher(20);
		teacher.setXs(1.2);
		System.out.println(t1.dlk());
		System.out.println(t2.dlk());
		teacher.setXs(1.1);
		System.out.println(t1.dlk());
		System.out.println(t2.dlk());

	}

}

class teacher{
	private double ksl;
	private static double xs=1;
	
	public teacher(double ksl) {
		this.ksl = ksl;
	}

	public static void setXs(double xs) {
		teacher.xs = xs;
	}
	
	public double dlk(){
		return xs*ksl;
	}
}
