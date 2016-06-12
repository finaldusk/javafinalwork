//12.编写一个计算矩形面积和立方体体积的类，该类完成计算的方法用静态方法实现。

package cn.wangxinlei.javafinalwork;

public class test12 {

	public static void main(String[] args) {
		System.out.println(area(12,12));
		System.out.println(bulk(12,12,12));

	}
	
	public static double area(double length,double width){
        return length * width;
    }
    public static double bulk(double length,double width,double height){
        return length * width * height;
    }

}
