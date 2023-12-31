import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Customer {
    private String tenKhach, diaChi, soDienThoai;
    private ArrayList<String> themSanPham;

    public Customer(String tenKhach, String diaChi, String soDienThoai) {
        this.tenKhach = tenKhach;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.themSanPham = new ArrayList<>();
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void themSanPhamVaoGioHang(Product sanPham) {
        themSanPham.add(sanPham.getTenSanPham());
    }

    public void xemGioHang() {
        System.out.println("Giỏ hàng hiện tại: " + themSanPham);
        System.out.println("Số lượng sản phầm: " + themSanPham.size());
    }

    public void datHang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ấn nút 1 để đặt hàng <3");
        int a = sc.nextInt();
        if(a == 1) {
            System.out.println("Tên: " + this.getTenKhach());
            System.out.println("Địa chỉ: " + this.getDiaChi());
            System.out.println("SĐT: " + this.getSoDienThoai());
            this.xemGioHang();
            this.themSanPham.clear();
        }
        else {
            System.out.println("Khách không đặt hàng -.-");
            this.themSanPham.clear();
        }
    }
}
