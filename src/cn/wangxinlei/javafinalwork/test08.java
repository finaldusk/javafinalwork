//8.编写方法实现，求一个“形式参数”的阶乘。在main方法中调用此方法，求45的阶乘。

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
