import java.util.Scanner;

/*
 * Kampüs Kırtasiyesi · Örnek portfolyo, KT1 sürümü
 * Ders: YMT1101 Algoritma ve Programlama I
 *
 * Bu uygulama derste birlikte büyütülen ÖRNEK projedir; konu havuzunda yoktur.
 * KT1'de istenen her şey burada: Scanner ile girdi, en az bir if/else,
 * ayırt edici kuralın en basit hali ve 0 ile çıkış.
 *
 * Ayırt edici kural (örnek): 10 ve üzeri adette yüzde 10 indirim.
 */
public class Uygulama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Şimdilik üç ürün ve fiyatları; diziler gelince (10. hafta) bir listeye taşınacak.
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

        if (secim == 0) {
            System.out.println("Iyi gunler!");
        } else if (secim < 1 || secim > 3) {
            System.out.println("Gecersiz secim.");
        } else {
            System.out.print("Adet: ");
            int adet = input.nextInt();

            double birimFiyat;
            if (secim == 1) {
                birimFiyat = KALEM;
            } else if (secim == 2) {
                birimFiyat = DEFTER;
            } else {
                birimFiyat = CIKTI;
            }

            double tutar = birimFiyat * adet;

            // Ayırt edici kural: 10 ve üzeri adette yüzde 10 indirim
            if (adet >= 10) {
                tutar = tutar * 0.90;
                System.out.println("Toplu alim indirimi uygulandi (%10).");
            }

            System.out.printf("Toplam: %.2f TL%n", tutar);
        }

        input.close();
    }
}
