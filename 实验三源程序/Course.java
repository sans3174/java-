package system;
public class Course{
	int number;
	String name;
	String location;
	String time;
	String instructor;
	int credit;
	Course(int a,String b,String c,String d,String e,int f){
		number =a;
		name=b;
		location=c;
		time=d;
		instructor=e;
		credit=f;
	}
	public String toString() {
		return "�γ����: "+number+"\n�γ�����"+name+"\n�Ͽεص㣺"+location+"\n�Ͽ�ʱ�䣺"+time+"\n�ڿ���ʦ��"+instructor;
	}
}