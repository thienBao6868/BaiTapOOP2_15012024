
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo a = new PhanSo();
		a.nhapphanso();
		a.xuatphanso();
		PhanSo b = new PhanSo();
		b.nhapphanso();
		b.xuatphanso();
		double tong = cong(a, b);
		double hieu = tru(a, b);
		double tich = nhan(a, b);
		double thuong = chia(a, b);
		System.out.println(tong + ";" + hieu + ";" + tich + ";" + thuong);
	}

	public static double cong(PhanSo a, PhanSo b) {
		double tong = ((double) a.tuSo / (double) a.mauSo) + ((double) b.tuSo / (double) b.mauSo);
		return tong;
	};

	public static double tru(PhanSo a, PhanSo b) {
		double hieu = ((double) a.tuSo / (double) a.mauSo) - ((double) b.tuSo / (double) b.mauSo);
		return hieu;
	};

	public static double nhan(PhanSo a, PhanSo b) {
		double tich = ((double) a.tuSo / (double) a.mauSo) * ((double) b.tuSo / (double) b.mauSo);
		return tich;
	};

	public static double chia(PhanSo a, PhanSo b) {
		double thuong = ((double) a.tuSo / (double) a.mauSo) / ((double) b.tuSo / (double) b.mauSo);
		return thuong;
	};

}
