//5.��дһ����Teacher,������ʦ�Ŀ�ʱ�����ͼ����ʱ��ϵ������Ϊdouble���͡�Teacher�໹��һ������compute(),�ɼ����ʦ�ĵ�����ʱ����ʱ��*ϵ����������ֵ����Ϊdouble�����н�ʦ�Ŀ�ʱϵ����ͬ����дһ����������в��ԣ�����������ʦ���󣬼����ϵ��Ϊ1.2�������������λ��ʦ�ĵ�����ʱ����ϵ���޸�Ϊ1.1������޸ĺ�ĵ�����ʱ��

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
