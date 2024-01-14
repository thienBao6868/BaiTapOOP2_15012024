import java.util.Scanner;

public class VanDongVien {
	String hoTen;
	int tuoi;
	String monThiDau;
	double canNang;
	double chieuCao;
	
	
	public VanDongVien() {};
	
	public VanDongVien(String hoTen, int tuoi, String monThiDau, double canNang, double chieuCao) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.monThiDau = monThiDau;
		this.canNang = canNang;
		this.chieuCao = chieuCao;
	}
	
	public void nhapthongtin () {
		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Vui lòng nhập họ tên : ");
		this.hoTen = scanner.nextLine();
		System.out.println("Vui lòng nhập tuổi : ");
		this.tuoi = scanner.nextInt();
		scanner.nextLine(); // Đọc dòng kết thúc từ lần nhập trước
		System.out.println(" Vui lòng nhập môn thi đấu : ");
		this.monThiDau = scanner.nextLine();
		System.out.println("Vui lòng nhập cân nặng : ");
		this.canNang = scanner.nextDouble();
		System.out.println("Vui lòng nhập chiều cao : ");
		this.canNang = scanner.nextDouble();
	};
	public void xuatthongtin () {
		
		System.out.println(" Họ tên :" + this.hoTen);
		
		System.out.println("tuổi : " + this.tuoi);
		
		System.out.println(" Môn thi đấu : " + this.monThiDau);
		
		System.out.println("Cân nặng : " + this.canNang);
		
		System.out.println("Chiều cao : " + this.chieuCao);
		
	};
}
