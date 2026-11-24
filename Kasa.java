import java.util.Scanner;
class Kasa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün adı nedir ? ");
        String ad = input.nextLine();
        System.out.print("Birim fiyatı nedir: ");
        double fiyat = input.nextDouble();
        System.out.print("Kaç adet aldınız: ");
        int adet = input.nextInt();
        System.out.print("Ödeme yönteminiz nedir? (1: Nakit, 2: Kredi kartı, 3: Yemek kartı): ");
        int odemeYontemi = input.nextInt();
        double toplam = adet * fiyat;
        double kartIndirimi = toplam * 0.05;
        double indirimliFiyat = toplam - kartIndirimi;
        switch (odemeYontemi) {
            case 1 -> {
                System.out.print("Ne kadar verdiniz: ");
                double para = input.nextDouble();
                double eksikPara = toplam - para;
                double paraUstu = para - toplam;
                if (para < toplam) {
                    System.out.println("Yetersiz ödeme! " + eksikPara + " TL eksik");
                } else {
                    System.out.println("--- Fiş ---");
                    System.out.println(adet + " adet " + ad);
                    System.out.println("Toplam: " + toplam + " TL");
                    if (para == toplam) {
                        System.out.println("Para üstü yok! Teşekkür ederiz.");
                    } else {
                        System.out.println("Para üstü: " + paraUstu + " TL");
                    }
                }
            }
            case 2 -> {
                System.out.println("--- Fiş ---");
                System.out.println(adet + " adet " + ad);
                System.out.println("Toplam: " + toplam + " TL");
                System.out.println("Kredi kartıyla ödemenizden dolayı uygulanan indirim: " + kartIndirimi + " TL");
                System.out.println("Ödenen tutar: " + indirimliFiyat + " TL");
                System.out.println("Kartla ödendi.");
            }
            case 3 -> System.out.println("Bu mağazada yemek kartı geçmiyor!");
            default -> System.out.println("Geçersiz seçim!");
        }
    }
}
