//7.��д�������ж�һ������ʽ�������Ƿ�Ϊˮ�ɻ�������main�����е��ô˷������ж�457�Ƿ���ˮ�ɻ�����

package cn.wangxinlei.javafinalwork;

public class test07 {

	public static void main(String[] args) {
		System.out.println(isSXHS(457));

	}
	
	public static boolean isSXHS(int num){
		int b=num/100;
		int s=num%100/10;
		int g=num%10;
		if(num==Math.pow(b, 3) + Math.pow(s, 3) + Math.pow(g, 3)){
			return true;
		}else{
			return false;
		}
		
	}
}
