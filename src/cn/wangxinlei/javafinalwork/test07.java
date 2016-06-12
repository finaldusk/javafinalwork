//7.编写方法，判断一个“形式参数”是否为水仙花数。在main方法中调用此方法，判断457是否是水仙花数。

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
