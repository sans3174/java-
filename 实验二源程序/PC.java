package PCcount;
public class PC{
	String pcbrand;
	String pctype;
	int pcprice;
	int m;
	int n;
	CPU cpu = new CPU();
	HardDisk HD = new HardDisk();
	PC(String a,String b,int c){
		pcbrand=a;
		pctype=b;
		pcprice=c;
	}
	PC(){
		System.out.println("�ɵ���PC(String a,String b,int c)���췽�����ü����Ʒ���ͺż���λ");
	}
	void setCPU(CPU c) {
		cpu=c;
	}
	void setHardDisk(HardDisk h) {
		HD=h;
	}
	void show() {
		m=cpu.getSpeed();
		n=HD.getAmount();
		if(m!=0&n!=0) {
			System.out.println("speed="+m+'\n'+"amount="+n);
	    }
		else if(m==0&n!=0) {
			System.out.println("cpu�����ٶ������������ʵ���ٴ�����");
		}
		else if(m!=0&n==0) {
			System.out.println("Ӳ�̴洢�����������ʵ���ٴ�����");
		}
		else {
			System.out.println("cpu�����ٶȼ�Ӳ�̴洢�����������ʵ���ٴ�����");
		}
	}
}