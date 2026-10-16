# Kampüs Kırtasiyesi · Örnek Portfolyo

YMT1101 Algoritma ve Programlama I · Doç. Dr. Ferhat Uçar

Bu depo derste **birlikte büyütülen örnek projedir**. Konusu havuzda yoktur, yani kimsenin konusu değildir;
sizin uygulamanız kendi konunuzla aynı iskeleti izler. Her kilometre taşında bu depo da bir adım büyür ve
o adımın nasıl yapıldığını derste birlikte görürüz.

## Konu

- Konu kodu ve adı: K00 Kampüs Kırtasiyesi (örnek, havuz dışı)
- Ayırt edici kural (numaranızın son hanesine göre): Kampanya, 10 ve üzeri adette yüzde 10 indirim (kural 8'in bir hali)
- Uygulama tek cümleyle ne yapıyor: Kırtasiyeden ürün seçtirip adede göre tutarı hesaplıyor.

## Kilometre taşları

| KT | Son teslim | Bu sürümde ne var | Durum |
|---|---|---|---|
| KT1 | 6 Kasım 2026 Cuma 23.59 | Scanner ile girdi, en az bir if/else, ayırt edici kuralın en basit hali, 0 ile çıkış | Hazır (bu sürüm) |
| KT2 | 27 Kasım 2026 Cuma 23.59 | Gözcü değerle biten menü döngüsü, girdi doğrulama döngüsü | 5-7. haftalarda eklenecek |
| KT3 | 11 Aralık 2026 Cuma 23.59 | Metotlar, dizi alıp tek değer döndüren metot, girdi doğrulayan metot; veriler dizide | 8-11. haftalarda eklenecek |
| KT4 | 25 Aralık 2026 Cuma 23.59 | Çalışan son sürüm, README tam, AI-BEYANI.md dolu, üç dil karşılaştırması | 14. haftada |

## Nasıl çalıştırılır

```bash
javac Uygulama.java
java Uygulama
```

Ana sınıf her zaman `Uygulama`, menüde `0` her zaman çıkıştır. Otomatik kontrol bu iki kurala güvenir.

## Kullandığım yapılar

- Değişkenler ve tipler: `int secim`, `int adet`, `double tutar`, `final double` sabitler
- Karar yapıları: `if / else if / else` (seçim ve kampanya)
- Döngüler: henüz yok (KT2)
- Metotlar: henüz yok (KT3)
- Diziler: henüz yok (KT3)

## Üç dil karşılaştırması (KT4)

Henüz yok.
