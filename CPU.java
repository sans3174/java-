package PCcount;
public class CPU{
	private int speed;
	public String cputype;
	public CPU(String a){
		cputype=a;
	}
	public CPU(){
		System.out.println("�ɵ���CPU(int a)���췽�����ô������ͺ�");
	}
	public void setSpeed(int m) {
		if(m>0) {
		speed=m;
		}
	}
	public int getSpeed() {
		return speed;
	}	
}