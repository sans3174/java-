package system;
public class Course{
	int number;
	String name;
	String location;
	String time;
	String instructor;
	Course(int a,String b,String c,String d,String e){
		number =a;
		name=b;
		location=c;
		time=d;
		instructor=e;
	}
	public String toString() {
		return "�γ����: "+number+"\n�γ�����"+name+"\n�Ͽεص㣺"+location+"\n�Ͽ�ʱ�䣺"+time+"\n�ڿ���ʦ��"+instructor;
	}
}