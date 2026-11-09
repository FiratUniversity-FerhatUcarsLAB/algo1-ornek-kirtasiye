import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Uygulama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int KAPASITE = 3;
        int mevcutDolu = 0;

        Queue<String> beklemeListesi = new LinkedList<>();

        final double SAAT_UCRETI = 20.0;
        int secim;

        do {
            System.out.println();
            System.out.println("=== Kampus Otoparki ===");
            System.out.println("Otopark Durumu: " + mevcutDolu + "/" + KAPASITE + " dolu");
            System.out.println("Bekleme Listesindeki Arac Sayisi: " + beklemeListesi.size());
            System.out.println("1) Arac Giris Talebi");
            System.out.println("2) Arac Cikisi (Yer Bosaltma)");
            System.out.println("0) Cikis");
            System.out.print("Seciminiz: ");
            secim = input.nextInt();
            input.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Arac plakasini giriniz: ");
                    String plaka = input.nextLine();

                    if (mevcutDolu < KAPASITE) {
                        mevcutDolu++;
                        System.out.println(plaka + " plakali arac otoparka giris yapti. Iyi gunler!");
                    } else {
                        beklemeListesi.add(plaka);
                        int siraKonumu = beklemeListesi.size();
                        System.out.println("Otopark dolu! Araciniz bekleme listesine alindi.");
                        System.out.println("Sira konumunuz: " + siraKonumu);
                    }
                    break;

                case 2:
                    if (mevcutDolu > 0) {
                        mevcutDolu--;
                        System.out.print("Kalan sureyi (saat cinsinden) giriniz: ");
                        int sure = input.nextInt();
                        double tutar = sure * SAAT_UCRETI;
                        System.out.printf("Odenmesi gereken tutar: %.2f TL%n", tutar);
                        System.out.println("Arac cikis yapti, 1 yer bosaldi.");

                        if (!beklemeListesi.isEmpty()) {
                            String siradakiArac = beklemeListesi.poll();
                            mevcutDolu++;
                            System.out.println(">>> Bekleme listesindeki " + siradakiArac + " plakali arac otoparka alindi.");
                        }
                    } else {
                        System.out.println("Otoparkta zaten hic arac yok!");
                    }
                    break;

                case 0:
                    System.out.println("Programdan cikiliyor. Iyi gunler!");
                    break;

                default:
                    System.out.println("Gecersiz secim.");
            }
        } while (secim != 0);

        input.close();
    }
}
