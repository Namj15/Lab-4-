package bai2;

class hoadon {
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;

    public hoadon(String maKhachHang, String hoTen, String ngayRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double tinhThanhTien() {
        return 0;
    }

    public void xuatThongTin() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày ra hoá đơn: " + ngayRaHoaDon);
    }
}

class khachhangvietnam extends hoadon {
    private String doiTuongKhachHang;
    private double soLuong;
    private double donGia;
    private double dinhMuc;

    public khachhangvietnam(String maKhachHang, String hoTen, String ngayRaHoaDon, String doiTuongKhachHang,
            double soLuong, double donGia, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
        return thanhTien;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Doi Tuong Khach Hang: " + doiTuongKhachHang);
        System.out.println("So Luong: " + soLuong);
        System.out.println("Don Gia: " + donGia);
        System.out.println("Dinh Muc: " + dinhMuc);
        System.out.println("Thanh Tien: " + tinhThanhTien());
        System.out.println("----------------------");
    }
}
