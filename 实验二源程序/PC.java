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
		System.out.println("可调用PC(String a,String b,int c)构造方法设置计算机品牌型号及价位");
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
			System.out.println("cpu运行速度数据有误，请核实后再次输入");
		}
		else if(m!=0&n==0) {
			System.out.println("硬盘存储数据有误，请核实后再次输入");
		}
		else {
			System.out.println("cpu运行速度及硬盘存储数据有误，请核实后再次输入");
		}
	}
}