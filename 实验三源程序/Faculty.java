package system;
public class Faculty extends Personnel {
	String giveCourse;
	Faculty(int a,String b,boolean c,String d){
		super(a,b,c);
		giveCourse=d;
	}
	
}