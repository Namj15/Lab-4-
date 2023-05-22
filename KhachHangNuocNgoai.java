package bai2;

class KhachHangNuocNgoai extends hoadon {
    private final String quocTich;
    private final double soLuong;
    private final double donGia;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, String quocTich, double soLuong,
            double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Quoc Tich: " + quocTich);
        System.out.println("So Luong: " + soLuong);
        System.out.println("Don Gia: " + donGia);
        System.out.println("Thanh Tien: " + tinhThanhTien());
        System.out.println("----------------------");
    }
}
