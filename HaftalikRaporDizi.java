import java.util.Scanner;
class HaftalikRaporDizi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] satislar = new double[7];
        for (int i = 0; i < satislar.length; i++){
            System.out.print((i + 1) + ". gün satışı: ");
            satislar[i] = input.nextDouble();
        }
        double toplam = toplamHesabi(satislar);
        double ortalamaSatis = toplam / satislar.length;
        for (int i = 0; i < satislar.length; i++){
            if (satislar[i] < ortalamaSatis){
                System.out.println((i + 1) + ". gün: " + satislar[i] + " TL ortalamanın altında");
            } else {
                System.out.println((i + 1) + ". gün: " + satislar[i] + " TL");
            }
        }
        System.out.println("Toplam: " + toplam + " TL");
        System.out.println("Ortalama satış: " + ortalamaSatis + " TL");
    }
    static double toplamHesabi(double[] dizi){
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++){
            toplam += dizi[i];
        }
        return toplam;
    }    
}