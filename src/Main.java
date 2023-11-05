public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Sua Tam", 100, "Enchanter", 200);
        Product product2 = new Product("Dau goi cho nam", 70, "Romano", 100);
        Product product3 = new Product("khan trai ban", 45, "Hoa Hong", 30);
        Product product4 = new Product("Lan khu mui", 30, "Nivia", 230);
        Product product5 = new Product("Bot giat Omo Matic 1 ký", 40, "Universal", 300);
        Product product6 = new Product("Nuoc Xa Vai", 90, "Comfort", 50);
        Product product7 = new Product("Nuoc Lau San", 56, "Sunlight", 150);
        Product product8 = new Product("Baking Sode", 27, "VN", 120);
        Product product9 = new Product("Tay Bon Cau", 49, "Vim", 230);
        Product product10 = new Product("Giay thom", 23, "FPit", 50);

        Customer khach1 = new Customer("Nguyen Hoang Hieu", "Go Vap", "0123456789");

        khach1.themSanPhamVaoGioHang(product1);
        khach1.themSanPhamVaoGioHang(product1);
        khach1.themSanPhamVaoGioHang(product2);

        khach1.xemGioHang();
    }
}