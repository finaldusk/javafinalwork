//13.��дһ��Custom�࣬���԰����������绰������͵�ַ����д���������Custom�Ļ�����Ϣ����д���Գ��򣬴��������ͻ����ֱ�����ͻ��Ļ�����Ϣ��

package cn.wangxinlei.javafinalwork;

public class test13 {

	public static void main(String[] args) {
		custom c1=new custom("wxl",1890405000,"wxl@wangxinlei.cn","B3#111");
		custom c2=new custom("wxx",1890405000,"wxl@wangxinlei.cn","B3#111");
		System.out.println(c1);
		System.out.println(c2);

	}

}

class custom{
	private String name;
	private long phone;
	private String mail;
	private String addr;
	public custom(String name, long phone, String mail, String addr) {
		this.name = name;
		this.phone = phone;
		this.mail = mail;
		this.addr = addr;
	}
	public String toString() {
		return "custom [name=" + name + ", phone=" + phone + ", mail=" + mail + ", addr=" + addr + "]";
	}
	
}