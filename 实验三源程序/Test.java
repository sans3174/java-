package system;
import java.util.Scanner;
import java.util.*;
public class Test{
	public static void main(String args[]) {
		String xing="student";
		int tuike;
		Faculty teacher1 =new Faculty(1,"Wang",true,"advanced_mathematics");
		Faculty teacher2 =new Faculty(2,"Zhang",false,"discrete_mathematics");
		Faculty teacher3 =new Faculty(3,"Li",true,"database");
		Faculty teacher4 =new Faculty(4,"Chen",false,"javaProgramming");
		Course advanced_mathematics =new Course(1,"advanced_mathematics","building1class1","7:50","Wang",3);
		Course discrete_mathematics =new Course(2,"discrete_mathematics","building1class2","9:40","Zhang",1);
		Course database =new Course(3,"database","building3class2","13��30","Li",2);
		Course javaProgramming =new Course(4,"javaProgramming","building2class1","4:05","Chen",2);
		Student student1 =new Student(1,"Ming",true); 
		Student student2 =new Student(2,"Hong",false); 
		Student student3 =new Student(3,"Guang",true); 
		Student student4 =new Student(4,"Gang",true); 
		Student student5 =new Student(5,"Xiao",true); 
		Student transtudent =new Student(0,"0",true); 
		System.out.println("����ѧ�ţ�");
		Scanner sacn1 = new Scanner(System.in); 
		int stnumber = sacn1.nextInt(); //�������⣬��������
		while (true) {
			System.out.println("����ѡ�����ƣ�");
			Scanner sacn2 = new Scanner(System.in);
			String name1 = sacn2.nextLine(); //�������⣬��������
			transtudent.chooseCourse(name1);
			System.out.println("�Ƿ����ѡ�Σ�");
			Scanner sacn3 = new Scanner(System.in); 
			int panduan1 = sacn3.nextInt(); //�������⣬��������
			if(panduan1==0) {
				break;
			}
		}
		System.out.println("�Ƿ��˿Σ�");
		Scanner sacn4 = new Scanner(System.in); 
		tuike = sacn4.nextInt(); //�������⣬��������
		while(tuike==1) {
			System.out.println("�����˿����ƣ�");
			Scanner sacn5 = new Scanner(System.in);
			String name2 = sacn5.nextLine(); //�������⣬��������
			transtudent.quitCourse(name2);
			System.out.println("�Ƿ�����˿Σ�");
			Scanner sacn6 = new Scanner(System.in); 
			int panduan2 = sacn6.nextInt(); //�������⣬��������
			if(panduan2==0) {
				break;
			}
		}
	    transtudent.transition(student1,student2,student3,student4,student5,transtudent,stnumber);
	    System.out.println(transtudent);		//��ѡ����Ϣ��ӡ
		System.out.println("�Ƿ�鿴�γ���ϸ��Ϣ��");
		Scanner sacn7 = new Scanner(System.in); 
		int xiangxi = sacn7.nextInt();
		while(xiangxi==1) {
			System.out.println("����γ����ƣ�");
			Scanner sacn8 = new Scanner(System.in);
			String coursename = sacn8.nextLine(); //�������⣬��������
			switch(coursename) {
			case "advanced_mathematics":System.out.println(advanced_mathematics);
			           break;
			case "discrete_mathematics":System.out.println(discrete_mathematics);
			break;
			case "database":System.out.println(database);
			break;
			case "javaProgramming":System.out.println(javaProgramming);
			break;
			}
			System.out.println("�Ƿ�����鿴��ϸ��Ϣ��");
			Scanner sacn10 = new Scanner(System.in); 
			int panduan3 = sacn10.nextInt(); //�������⣬��������
			if(panduan3==0) {
				break;
			}
		}
		
	}
}