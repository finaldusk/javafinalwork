//3.��дһ���࣬����������������һ��������forѭ������1-100�ĺͣ��ڶ���������whileѭ������1-100�ĺͣ���д�������������������

package cn.wangxinlei.javafinalwork;

public class test03 {

	public static void main(String[] args) {
		System.out.println(forcount());
		System.out.println(whilecount());
	}
	public static int forcount(){
		int count=0;
		for(int i=1;i<=100;i++){
			count+=i;
		}
		return count;
	}
	public static int whilecount(){
		int count=0;
		int i=1;
		while(i<=100){
			count+=i++;
		}
		return count;
	}

}
