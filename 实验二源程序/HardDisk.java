package PCcount;
public class HardDisk {
	private int amount;
	String harddisktype;
	HardDisk(String a){
		harddisktype=a;
	}
	HardDisk(){
		System.out.println("�ɵ���HardDisk(String a)���췽������Ӳ���ͺ�");
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