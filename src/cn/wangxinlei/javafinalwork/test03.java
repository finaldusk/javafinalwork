//3.编写一个类，有两个方法，期中一个方法用for循环，求1-100的和，第二个方法用while循环，求1-100的和，编写测试类调用两个方法。

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
