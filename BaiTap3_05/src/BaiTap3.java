import java.util.Scanner;

public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int chonLoaiNhanVien;

		System.out.println("Nếu là nhân viên văn phòng vui lòng nhập: 0");
		System.out.println("Nếu là nhân viên sản xuất vui lòng chọn: 1");
		chonLoaiNhanVien = scanner.nextInt();

		if (chonLoaiNhanVien == 0) {
			NhanVienVanPhong nhanVien1 = new NhanVienVanPhong();
			nhanVien1.xuatThongTin();
		} else {
			NhanVienSanXuat nhanVien1 = new NhanVienSanXuat();
			nhanVien1.xuatThongTin();
		}

	}

}
