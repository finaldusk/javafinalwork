//10.编写方法实现计算员工的总收入。某公司对每周40小时以内的工作支付普通员工，每小时支付20元钱，超过40小时的工作支付1.5倍的工资。把员工的工作时间作为“形式参数”，在方法中打印该员工的工资。在main方法中调用此方法，计算工作48小时应该付给多少钱。

package cn.wangxinlei.javafinalwork;

public class test10 {

	public static void main(String[] args) {
		System.out.println(salary(48));

	}
	public static double salary(double time){
		if (time<40){
			return 20*time;
		}else{
			return 20*time*1.5;
		}
	}

}
