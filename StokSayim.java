import java.util.Scanner;
class StokSayim {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Depoda kaç tane ürün var? ");
        int adet = input.nextInt();
        System.out.print("Her seferinde kaç adet ürün satılıyor? ");
        int satilanAdet = input.nextInt();
        int yapilanSatis = 0;
        while (adet >= satilanAdet){
            adet -= satilanAdet;
            System.out.println("Kalan stok: " + adet );
            yapilanSatis++;
        }
        System.out.println("Toplam " + yapilanSatis + " satış yapıldı");
        if (adet == 0){
            System.out.println("Raf tamamen boşaldı.");   
        } else {
            System.out.println("Elimizde yeterli stok yok. Kalan stok: " + adet);
        }
    }
}
