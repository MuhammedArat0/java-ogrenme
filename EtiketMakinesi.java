class EtiketMakinesi {
    public static void main(String[] args){
        etiketBas("Hoodie", 999.99, 20);
        etiketBas("T-shirt", 499.99, 15);
        etiketBas("Jean", 1999.99, 30);
        if (stokYeterliMi(5, 3)){
            System.out.println("Stok: 5, İstenen: 3 -> Satış yapılabilir.");
        } else {
            System.out.println("Stok: 5, İstenen: 3 -> Yetersiz stok!");
        }
        if (stokYeterliMi(2, 3)){
            System.out.println("Stok: 2, İstenen: 3 -> Satış yapılabilir.");
        } else {
            System.out.println("Stok: 2, İstenen: 3 -> Yetersiz stok!");
        }
    }
    static void etiketBas(String ad, double fiyat, int indirimYuzdesi){
        double sonFiyat = indirimliFiyatHesapla(fiyat, indirimYuzdesi);
        System.out.println("=================");
        System.out.println("Ürün adı: " + ad);
        System.out.println("Ürünün fiyatı: " + fiyat + " TL");
        System.out.println("%" + indirimYuzdesi + " İNDİRİM!");
        System.out.println("İndirimden sonraki fiyat: " + sonFiyat + " TL");
        System.out.println("=================");
    }
    static double indirimliFiyatHesapla(double fiyat, int indirimYuzdesi){
        double indirimTutari = indirimYuzdesi * 0.01 * fiyat;
        double sonuc = fiyat - indirimTutari;
        return sonuc;
    }
    static boolean stokYeterliMi(int stok, int istenenAdet){
        if (stok >= istenenAdet){
            return true;
        } else {
            return false;
        }
    }
}