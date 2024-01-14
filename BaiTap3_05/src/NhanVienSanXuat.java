import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien{
	double luongCanBan;
	int soSanPham;
	double luong;
	
	public double tinhLuong(double luongCanBan, double soSanPham) {
		double tongLuong = luongCanBan + soSanPham * 5000;
		return tongLuong;
	}
	public void nhapThongTin() {
		// scanner 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui lòng nhập họ tên: ");
		this.hoTen = scanner.nextLine();
		System.out.println("Vui lòng nhập ngày sinh: ");
		this.ngaySinh = scanner.nextInt();
		System.out.println("Vui lòng nhập số sản phẩm: ");
		this.soSanPham = scanner.nextInt();
		System.out.println("Vui lòng nhập lương căn bản: ");
		this.luongCanBan  = scanner.nextDouble();
	};
	public void xuatThongTin() {
		this.nhapThongTin();
		this.luong = this.tinhLuong(this.luongCanBan, this.soSanPham);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Ngày sinh: "+ this.ngaySinh);
		System.out.println("Số sản phẩm: " + this.soSanPham);
		System.out.println("Lương căn bản: " + this.luongCanBan);
		System.out.println("Tổng lương là: " + this.luong);
	};
}
