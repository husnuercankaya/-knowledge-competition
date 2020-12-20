import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		List<Soru> sorular = Araçlar.sorulariOlustur();
		int dogruCevapSayısı = 0;
		int yanlışCevapSayısı = 0;

		System.out.println("    BİLGİ YARIŞMASI  ");
		System.out.println();
		System.out.println("OYUNUN KURALLARINI ÖĞRENMEK İÇİN -- 1");
		System.out.println("OYUNA BAŞALAMAK İÇİN -- 2 ");
		System.out.println();
		int secim = scan.nextInt();

		switch (secim) {

		case 1:
			System.out.println(
					" Size  10 adet soru soracağız.\n Soru başına verilen süreniz 10 saniye .\n Doğru bildiğniz her soru için 5 puan kazanacaksınız.  ");

			break;
		case 2:

			int i = 1;
			while (i <= 3) {
				System.out.println("OYUN BAŞLIYOR ");
				System.out.println();
				Thread.sleep(700);
				i++;
			}

			int id1;
			for (id1 = 1; id1 <= 10; id1++) {
				int kalanSure = Araçlar.getKalanSure();
				if (kalanSure <= 0  ) {
					System.out.println("SÜRENİZ BİTTİ");
					break;
				}
				int soruIndex = Araçlar.getRandom(sorular.size());
				Soru soru = sorular.get(soruIndex);
				String soruCumlesi = soru.soruCumlesi;
				String scnA = soru.Asecenek;
				String scnB = soru.Bsecenek;
				String scnC = soru.Csecenek;
				String scnD = soru.Dsecenek;
				String dogruSecenek = soru.dogruSecenek;

				System.out.println("SORU " + id1 + ": " + soruCumlesi.toUpperCase());
				System.out.println();
				System.out.println(scnA.toUpperCase());
				System.out.println(scnB.toUpperCase());
				System.out.println(scnC);
				System.out.println(scnD);
				System.out.println();

				System.out.println("CEVAP GİRİNİZ :");
				String cevap = scan.next();

				boolean dogruMu = cevap.equals(dogruSecenek);
				

				if (dogruMu) {
					dogruCevapSayısı++;
				} else
					yanlışCevapSayısı++;
				
				sorular.remove(soruIndex);
					
			}
			
			System.out.println("TOPLAM DOĞRU SAYISI = " + dogruCevapSayısı);
			System.out.println("TOPLAM YANLIŞ SAYISI = " + yanlışCevapSayısı);
			System.out.println("PUAN : " + (dogruCevapSayısı * 5));
		}
	}
}
