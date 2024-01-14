import java.util.Scanner;

public class PhanSo {
	int tuSo;
	int mauSo;
	
	public PhanSo () {};
	
	public void nhapphanso() {
		// scanner 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui lòng nhập tử số : " );
		this.tuSo = scanner.nextInt();
		System.out.println("Vui lòng nhập mẫu số  : " );
		this.mauSo = scanner.nextInt();
	}
	public void xuatphanso() {
		System.out.println("Phân số là :" +  this.tuSo + "/" +this.mauSo );
	};
	
}
