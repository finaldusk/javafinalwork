//11.编写表示日期的类Date,属性有年，月和日，定义构造方法，定义计算明天日期的方法。编写测试程序，创建一个表示当天日期的对象，调用计算明天日期的方法。

package cn.wangxinlei.javafinalwork;

import java.util.Calendar;

public class test11 {

	public static void main(String[] args){
		Calendar a=Calendar.getInstance();
		Date d=new Date(a.get(Calendar.YEAR),a.get(Calendar.MONTH),a.get(Calendar.DAY_OF_MONTH));
		System.out.println(d);
		Date nd=d.nextday();
		System.out.println(nd);
	}
	
}
class Date{
	private int year;
	private int month;
	private int day;
	//假定用户不会输入超出范围的时间值
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	public Date nextday(){
		int year=this.year;
		int month=this.month;
		int day=this.day;
		switch(month){
		case 4:
		case 6:
		case 9:
		case 11:if(day==30){
			month++;
			day=1;
		}else{
			day++;
		}
		break;
		case 2:if(year/4.0==0&day==29){
			month++;
			day=1;
		}else if(day==28){
			month++;
			day=1;
		}else{
			day++;
		}
		break;
		default:if (day==31){
			month++;
			day=1;
		}else{
			day++;
		}
		if(month>12){
			year=year+month/12;
			month=month%12;
		}
		break;
		}
		Date d=new Date(year,month,day);
		return d;
	}
	
}