import java.util.Scanner;
class HaftalikRapor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double toplamSatis = 0;
        int gunSayisi = 7;
        double rekorSatis = 0;
        int rekorGunu = 0;
        for (int gun = 1; gun <= gunSayisi; gun++){
            System.out.print(gun + ". günün satış tutarı: ");
            double satis = input.nextDouble();
            toplamSatis += satis;
            if (satis > rekorSatis){
                rekorSatis = satis;
                rekorGunu = gun;
            }
        }
        double gunlukOrtalama = toplamSatis / gunSayisi;
        System.out.println("--- Haftalık Rapor ---");
        System.out.println("Haftalık toplam satış: " + toplamSatis + " TL");
        System.out.println("Günlük ortalama satış: " + gunlukOrtalama + " TL");
        System.out.println("En iyi gün: " + rekorGunu + ". gün " + rekorSatis + " TL" );
    }
}