package PCcount;
public class Test{
	String advice;
	int count;
	Test(){
	}
	Test(String a){
		advice=a;
	}
	public static void main(String arg[]) {
		CPU cpu = new CPU();
		HardDisk disk =new HardDisk();
		PC pc = new PC();
		cpu.setSpeed(2200);
		disk.setAmount(200);
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
	void fankui() {
		System.out.println("�ɵ���Test(String a)�ڹ���ö���ʱ�������");
	}
}
