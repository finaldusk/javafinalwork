//8.��д����ʵ�֣���һ������ʽ�������Ľ׳ˡ���main�����е��ô˷�������45�Ľ׳ˡ�

package cn.wangxinlei.javafinalwork;

import java.math.BigInteger;

public class test08 {

	public static void main(String[] args) {
		System.out.println(fact(45));

	}
	public static BigInteger fact(int num){
		if(num > 0){             
            return BigInteger.valueOf(num).multiply(fact(num-1));  
        }else{        
            return BigInteger.ONE;  
        } 
	}

}
