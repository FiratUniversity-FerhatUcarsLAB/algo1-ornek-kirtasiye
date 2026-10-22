import java.util.Scanner;

/*
 * Kampüs Kırtasiyesi · Örnek portfolyo, 5. hafta sürümü (KT1 şartlarını sağlar)
 * Ders: YMT1101 Algoritma ve Programlama I
 *
 * Bu uygulama derste birlikte büyütülen ÖRNEK projedir; konu havuzunda yoktur.
 * Bu haftaki adım: ürün seçimi if/else merdiveninden switch'e taşındı.
 * Ayırt edici kural (örnek, kural 7 "Kullanıcı türü"): öğrenci kartı gösterene yüzde 10 indirim.
 * Menüde 0 her zaman çıkıştır; ana sınıf her zaman Uygulama'dır.
 */
public class Uygulama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double KALEM = 15.0;
        final double DEFTER = 60.0;
        final double CIKTI = 2.5;   // sayfa başına

        System.out.println("=== Kampus Kirtasiyesi ===");
        System.out.println("1) Kalem   15.00 TL");
        System.out.println("2) Defter  60.00 TL");
        System.out.println("3) Cikti    2.50 TL / sayfa");
        System.out.println("0) Cikis");
        System.out.print("Seciminiz: ");
        int secim = input.nextInt();

        double birimFiyat = 0;
        String urun = "";

        // Bu haftanın adımı: aynı karar, switch ile. Her case'in sonunda break var;
        // break olmazsa akış bir alttaki case'e "düşer" (fall-through).
        switch (secim) {
            case 1:
                urun = "Kalem";
                birimFiyat = KALEM;
                break;
            case 2:
                urun = "Defter";
                birimFiyat = DEFTER;
                break;
            case 3:
                urun = "Cikti";
                birimFiyat = CIKTI;
                break;
            case 0:
                System.out.println("Iyi gunler!");
                break;
            default:
                System.out.println("Gecersiz secim.");
        }

        if (secim >= 1 && secim <= 3) {
            System.out.print("Adet: ");
            int adet = input.nextInt();
            System.out.print("Ogrenci karti var mi (e/h): ");
            char kart = input.next().charAt(0);

            double tutar = birimFiyat * adet;

            // Ayırt edici kural: kullanıcı türü. Öğrenci kartı gösterene yüzde 10 indirim.
            if (kart == 'e') {
                tutar = tutar * 0.90;
                System.out.println("Ogrenci indirimi uygulandi (%10).");
            }

            System.out.printf("%s x %d = %.2f TL%n", urun, adet, tutar);
        }

        input.close();
    }
}
