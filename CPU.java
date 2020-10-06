package PCcount;
public class CPU{
	private int speed;
	public String cputype;
	public CPU(String a){
		cputype=a;
	}
	public CPU(){
		System.out.println("可调用CPU(int a)构造方法设置处理器型号");
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