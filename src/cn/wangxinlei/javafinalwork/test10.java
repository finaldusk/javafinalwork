//10.��д����ʵ�ּ���Ա���������롣ĳ��˾��ÿ��40Сʱ���ڵĹ���֧����ͨԱ����ÿСʱ֧��20ԪǮ������40Сʱ�Ĺ���֧��1.5���Ĺ��ʡ���Ա���Ĺ���ʱ����Ϊ����ʽ���������ڷ����д�ӡ��Ա���Ĺ��ʡ���main�����е��ô˷��������㹤��48СʱӦ�ø�������Ǯ��

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
