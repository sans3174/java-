package PCcount;
public class HardDisk {
	private int amount;
	String harddisktype;
	HardDisk(String a){
		harddisktype=a;
	}
	HardDisk(){
		System.out.println("可调用HardDisk(String a)构造方法设置硬盘型号");
	}
	void setAmount(int m){
		if(m>0) {
			amount=m;
			}
	}
	int getAmount() {
		return amount;
	}
}