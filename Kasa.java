import java.util.Scanner;
class Kasa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün adı ? ");
        String ad = input.nextLine();
        System.out.print("Birim fiyatı nedir: ");
        double fiyat = input.nextDouble();
        System.out.print("Kaç adet aldınız: ");
        int adet = input.nextInt();
        System.out.print("Ne kadar verdiniz: ");
        double para = input.nextDouble();
        
        System.out.println("Ürün adı: " + ad);
        System.out.println("Birim fiyatı: " + fiyat);
        System.out.println("Adet: " + adet);
        System.out.println("Müşterinin verdiği para: " + para);
        System.out.println("--- Fiş ---");

        System.out.println(adet + " adet " + ad);
        double toplam = (adet * fiyat);
        double paraUstu = (para - toplam);
        System.out.println("Toplam: " + toplam + " TL");
        System.out.println("Para üstü: " + paraUstu + " TL");

    }
}