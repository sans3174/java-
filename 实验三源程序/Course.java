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
		return "课程序号: "+number+"\n课程名："+name+"\n上课地点："+location+"\n上课时间："+time+"\n授课老师："+instructor;
	}
}