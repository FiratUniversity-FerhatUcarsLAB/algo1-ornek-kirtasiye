import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double KALEM = 15.0;
        final double DEFTER = 60.0;
        final double CIKTI = 2.5;

        double gunlukToplam = 0;
        int islemSayisi = 0;
        int secim;

        do {
            System.out.println();
            System.out.println("=== Kampus Kirtasiyesi ===");
            System.out.println("1) Kalem   15.00 TL");
            System.out.println("2) Defter  60.00 TL");
            System.out.println("3) Cikti    2.50 TL / sayfa");
            System.out.println("0) Cikis");
            System.out.print("Seciminiz: ");
            secim = input.nextInt();

            double birimFiyat = 0;
            String urun = "";

            switch (secim) {
                case 1: urun = "Kalem";  birimFiyat = KALEM;  break;
                case 2: urun = "Defter"; birimFiyat = DEFTER; break;
                case 3: urun = "Cikti";  birimFiyat = CIKTI;  break;
                case 0: System.out.println("Iyi gunler!"); break;
                default: System.out.println("Gecersiz secim.");
            }

            if (secim >= 1 && secim <= 3) {
                int adet;
                do {
                    System.out.print("Adet (en az 1): ");
                    adet = input.nextInt();
                } while (adet < 1);

                System.out.print("Ogrenci karti var mi (e/h): ");
                char kart = input.next().charAt(0);

                double tutar = birimFiyat * adet;
                if (kart == 'e') {
                    tutar = tutar * 0.90;
                    System.out.println("Ogrenci indirimi uygulandi (%10).");
                }
                System.out.printf("%s x %d = %.2f TL%n", urun, adet, tutar);

                gunlukToplam += tutar;
                islemSayisi++;
            }
        } while (secim != 0);

        System.out.printf("Bugun %d islem, toplam %.2f TL%n", islemSayisi, gunlukToplam);
        input.close();
    }
}
