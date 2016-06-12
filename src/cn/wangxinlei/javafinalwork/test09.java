//9.编写方法实现计算任意三位数的各个位数之和，例如324的各个位数之和为3+2+4=9.

package cn.wangxinlei.javafinalwork;

public class test09 {

	public static void main(String[] args) {
		System.out.println(digitcount(324));

	}
	public static int digitcount(int num){
		return num/100+num%100/10+num%10;
	}

}
