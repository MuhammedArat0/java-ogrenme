class DepoHesap {
    public static void main(String[] args){
        int tshirtSayisi = 50;
        int koliAdet = 12;
        double tshirtFiyat = 249.90;
        System.out.println("Tam koli sayısı: " + tshirtSayisi / koliAdet);
        System.out.println("Açıkta kalan t-shirt sayısı: " + tshirtSayisi % koliAdet);
        System.out.println("Toplam t-shirt fiyatı: " + tshirtSayisi * tshirtFiyat);
        tshirtSayisi -=8 ;
        System.out.println("Satış sonrası stok: " + tshirtSayisi);
        System.out.println("Yeni tam koli: " + tshirtSayisi / koliAdet);
        System.out.println("Açıkta kalan t-shirt sayısı: " + tshirtSayisi % koliAdet);
        System.out.println("Satış sonrası toplam t-shirt fiyatı: " + tshirtSayisi * tshirtFiyat);


    }
}