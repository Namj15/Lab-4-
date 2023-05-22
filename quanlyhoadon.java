package bai2;


import java.util.ArrayList;
import java.util.List;

class quanlyhoadon {
    private List<HoaDon> danhSachHoaDon;

    public quanlyhoadon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void xuatDanhSachHoaDon() {
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.xuatThongTin();
        }
    }

    public int demSoLuongKhachHangVietNam() {
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof khachhangvietnam) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                tongThanhTien += hoaDon.tinhThanhTien();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return tongThanhTien / count;
    }

    public void xuatHoaDonThang9Nam2013() {
        System.out.println("Hoá đơn trong tháng 09 năm 2013:");
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.ngayRaHoaDon.contains("09/2013")) {
                hoaDon.xuatThongTin();
            }
        }
    }

 public static void main(String[] args) {
        quanlyhoadon qlhd = new quanlyhoadon();

        khachhangvietnam khachHang1 = new khachhangvietnam("KH001", "Nguyễn Thanh Binh", "07/09/2013", "sinh hoạt",
                100, 5000, 50);
        khachhangvietnam khachHang2 = new khachhangvietnam("KH002", "Trần Thai Thien", "18/09/2013", "kinh doanh",
                150, 6000, 80);
        KhachHangNuocNgoai khachHang3 = new KhachHangNuocNgoai("KH003", "Nguyen Quang Minh", "08/09/2013", "USA",
                200, 7000);

        qlhd.themHoaDon(khachHang1);
        qlhd.themHoaDon(khachHang2);
        qlhd.themHoaDon(khachHang3);

        qlhd.xuatDanhSachHoaDon();

        int soLuongKhachHangVietNam = qlhd.demSoLuongKhachHangVietNam();
        System.out.println("Tổng số lượng khách hàng Việt Nam: " + soLuongKhachHangVietNam);

        double trungBinhThanhTienKhachHangNuocNgoai = qlhd.tinhTrungBinhThanhTienKhachHangNuocNgoai();
        System.out.println("Trung bình thành tiền khách hàng nước ngoài: " + trungBinhThanhTienKhachHangNuocNgoai);

        qlhd.xuatHoaDonThang9Nam2013();
    }
}
