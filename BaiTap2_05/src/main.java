
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VanDongVien vanDongVien1 = new VanDongVien();
		vanDongVien1.nhapthongtin();
		vanDongVien1.xuatthongtin();
		VanDongVien vanDongVien2 = new VanDongVien("Bao", 27, "BongDa", 68.5, 179);
		vanDongVien2.xuatthongtin();
		sosanh(vanDongVien1, vanDongVien2);
	};

	public static void sosanh(VanDongVien vanDongVien1, VanDongVien vanDongVien2) {
		if (vanDongVien1.chieuCao > vanDongVien2.chieuCao) {
			System.out.println("VanDongVien1 lon hon vanDongVien2 ");
		} else if (vanDongVien1.chieuCao < vanDongVien2.chieuCao) {
			System.out.println("VanDongVien2 lon hon vanDongVien1 ");
		} else {
			if (vanDongVien1.chieuCao > vanDongVien2.chieuCao) {
				System.out.println("VanDongVien1 lon hon vanDongVien2 ");
			} else if (vanDongVien1.chieuCao < vanDongVien2.chieuCao) {
				System.out.println("VanDongVien2 lon hon vanDongVien1 ");
			} else {
				System.out.println("không phân thắng bại ");
			}
		}
	};

}
