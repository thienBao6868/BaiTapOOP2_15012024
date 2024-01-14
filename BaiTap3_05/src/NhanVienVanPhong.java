import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
	double soNgayLamViec;
	double luong;
	public double tinhLuong(double soNgayLamViec) {
		double tongLuong = soNgayLamViec * 100000;
		return tongLuong;
	}
	
	public void nhapThongTin() {
		// scanner 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui lòng nhập họ tên: ");
		this.hoTen = scanner.nextLine();
		System.out.println("Vui lòng nhập ngày sinh: ");
		this.ngaySinh = scanner.nextInt();
		System.out.println("Vui lòng nhập số ngày làm việc: ");
		this.soNgayLamViec = scanner.nextDouble();
	};
	public void xuatThongTin() {
		this.nhapThongTin();
		this.luong = this.tinhLuong(this.soNgayLamViec);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Ngày sinh: "+ this.ngaySinh);
		System.out.println("Số ngày làm việc: " + this.soNgayLamViec);
		System.out.println("Tổng lương là: " + this.luong);
	};
}
