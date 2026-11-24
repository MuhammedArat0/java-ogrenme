import java.util.Scanner;
class KasaDongusu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int musteriVarmi = 1;
        while (musteriVarmi == 1){
            System.out.print("Ürünün ismi: ");
            String urunAdi = input.nextLine();
            System.out.print("Ürünün fiyatı: ");
            double fiyat = input.nextDouble();
            System.out.print("Kaç adet alındı: ");
            int adet = input.nextInt();
            System.out.print("Ödeme yöntemi? (1: Nakit, 2: Kredi kartı): ");
            int odemeYontemi = input.nextInt();
            double toplam = fiyat * adet;
            double kartIndirimi = toplam * 0.05;
            double indirimliFiyat = toplam - kartIndirimi;
            switch (odemeYontemi) {
                case 1 -> {
                    System.out.print("Ne kadar para verildi? ");
                    double para = input.nextDouble();
                    double kalan = para - toplam;
                    if (toplam > para) {
                        System.out.println("Yetersiz para verildi!");
                    } else {
                        System.out.println("--Fiş--");
                        System.out.println("Ürün adı: " + urunAdi);
                        System.out.println("Ürün adedi: " + adet);
                        System.out.println("Ürünün fiyatı: " + fiyat);
                        System.out.println("Ödenen toplam tutar: " + toplam + " TL");
                        if (toplam == para) {
                            System.out.println("Para üstü yok. Teşekkür ederiz!");
                        } else {
                            System.out.println("Para üstü: " + kalan + " TL");
                        }
                    }
              } case 2 -> {
                    System.out.println("--Fiş--");
                    System.out.println("Ürün adı: " + urunAdi);
                    System.out.println("Ürün adedi: " + adet);
                    System.out.println("Ürünün fiyatı: " + fiyat);
                    System.out.println("Kartla ödendiği için uygulanan indirim: " + kartIndirimi + " TL");
                    System.out.println("İndirimden sonra ödenen toplam tutar: " + indirimliFiyat + " TL");
              } default -> System.out.println("Geçersiz seçim!");
          } 
            System.out.print("Başka müşteri var mı? (1: Evet, 0: Hayır): ");
            musteriVarmi = input.nextInt();
            input.nextLine();
      } System.out.println("Gün sonu. Kasa kapandı.");
    }
}
