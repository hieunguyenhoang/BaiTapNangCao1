public class Product {
    private String tenSanPham;
    private double giaTien;
    private String moTaSanPham;
    private int soLuongTrongKho;

    public Product(String tenSanPham, double giaTien, String moTaSanPham, int soLuongTrongKho) {
        this.tenSanPham = tenSanPham;
        this.giaTien = giaTien;
        this.moTaSanPham = moTaSanPham;
        this.soLuongTrongKho = soLuongTrongKho;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    public int getSoLuongTrongKho() {
        return soLuongTrongKho;
    }

    public void setSoLuongTrongKho(int soLuongTrongKho) {
        this.soLuongTrongKho = soLuongTrongKho;
    }
}
