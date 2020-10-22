package system;
public class Student extends Personnel{
	String course1="null";
	String course2="null";
	String course3="null";
	String course4="null";
	int coursecount=0;
	Student(int a,String b,boolean c){
		super(a,b,c);
	}
	void chooseCourse(String a) {
		if(course1=="null") {
			course1=a;
		}
		else if(course2=="null") {
			course2=a;
		
		}
		else if(course3=="null") {
			course3=a;
		
		}
		else if(course4=="null") {
			course4=a;
			
		}
		else {
			System.out.println("选课数已达上限");
		}
		coursecount++;
	}
	void quitCourse(String a) {
		if(course4.equals(a)) {
			course4=null;
			System.out.println("1");
		}
		else if(course3.equals(a)) {
			switch(coursecount) {
			case 4: course3=course4;
					course4=null;
					break;
			case 3: course3=null;
					break;
			}
		}
		else if(course2.equals(a)) {
			switch(coursecount) {
			case 4: course2=course4;
					course4=null;
					break;
			case 3: course2=course3;
					course3=null;
					break;
			case 2: course2=null;
					break;
			}
		}
		else if(course1.equals(a)) {
			switch(coursecount) {
			case 4: course1=course4;
					course4=null;
					break;
			case 3: course1=course3;
					course3=null;
					break;
			case 2: course1=course2;
					course2=null;
					break;
			case 1: course1=null;
			 	    break;
			}
		}
		else {
			System.out.println("未选该门课程");
		}
		coursecount--;
	} 
	public void transition(Student a,Student b,Student c,Student d,Student e,Student f,int g) {
		switch(g) {
		case 1:a.course1=f.course1;
		       a.course2=f.course2;
		       a.course3=f.course3;
		       a.course4=f.course4;
		       break;
		case 2:b.course1=f.course1;
	       	   b.course2=f.course2;
	       	   b.course3=f.course3;
	       	   b.course4=f.course4;
	       break;
		case 3:c.course1=f.course1;
	           c.course2=f.course2;
	           c.course3=f.course3;
	           c.course4=f.course4;
	       break;
		case 4:d.course1=f.course1;
	           d.course2=f.course2;
	           d.course3=f.course3;
	           d.course4=f.course4;
	       break;
		case 5:e.course1=f.course1;
               e.course2=f.course2;
               e.course3=f.course3;
               e.course4=f.course4;
          break;
		}
	}
	public String toString() {
		if(course1==null) {
			coursecount=0;
		}
		else if(course2==null) {
			coursecount=1;
		}
		else if(course3==null) {
			coursecount=2;
		}
		else if(course4==null) {
			coursecount=3;
		}
		else {
			coursecount=4;
		}
		switch(coursecount) {
		case 0:return "该学生还未选课" ;
		case 1:return "该学生已选课："+course1 ;
		case 2:return "该学生已选课："+course1+" "+course2;
		case 3:return "该学生已选课："+course1+" "+course2+" "+course3;
		case 4:return "该学生已选课："+course1+" "+course2+" "+course3+" "+course4;
		}
		return null;
	}	

}
