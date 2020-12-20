import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Araçlar {

	public static int toplamSoruSuresi = 10;
	
	public static List<Soru> sorulariOlustur() {

		List<Soru> soruListesi = new ArrayList();

		Soru soru1 = new Soru("İNSAN VÜCUDU HER GÜN ORTALAMA KAÇ KEZ NEFES ALIR ?", "A -10,000", "B -20,000",
				"C-30,000", "D -40 .000", "B");
		soruListesi.add(soru1);

		Soru soru2 = new Soru("YUSSUFCUĞUN ÖMRÜ NEDİR ?", "A-24 SAAT ", "B-48 SAAT", "C-72 SAAT", "D-96 SAAT",
				"A");
		soruListesi.add(soru2);

		Soru soru3 = new Soru("AHTAPOTUN KAÇ ADET KALBİ VARDIR ?", "A-3 ", "B-4", "C-5", "D-6", "A");
		soruListesi.add(soru3);

		Soru soru4 = new Soru("AŞŞAĞIDAKİLERDEN HANGİSİ AZİZ NESİN'İN ESERİ DEĞİLDİR   ?", "A-ZÜBÜK", "B-GOL KRALI",
				"C-YER DEMİR GÖK BAKIR  ", "D-EL AYVAN DEYİP GEÇME", "C");
		soruListesi.add(soru4);

		Soru soru5 = new Soru("TÜRK SİLAHLI KUVVETLERİNDE HANGİ RÜTBE DAHA YÜKSEKTİR ?", "A-KORGENERAL", "B-TUĞGENERAL",
				"C-TÜMGENERAL ", "D-ORGENERAL", "D");
		soruListesi.add(soru5);

		Soru soru6 = new Soru("BİR TAKIM EN FAZLA KAÇ UEFA KUPASI KAZANMIŞTIR ?", "A-4", "B-5", "C-6", "D-7",
				"C");
		soruListesi.add(soru6);

		Soru soru7 = new Soru("OSMANLI İMPARATORLUĞUNDA LALE DEVRİNİ BAŞLATAN PADİŞAH KİMDİR ?", "A -III AHMET ",
				"B-IV MURAT", "C-III SELİM ", "D-FATİH SULTAN MEHMET", "A");
		soruListesi.add(soru7);

		Soru soru8 = new Soru("PİYANODA KAÇ ADET TUŞ VARDIR ?", "A-77", "B-83", "C-88", "D-94", "C");
		soruListesi.add(soru8);

		Soru soru9 = new Soru("İSTANBULU KUŞATAN İLK TÜRK DEVLETİ HANGİSİDİR ?", "A-AVRUPA HUN DEVLETİ", "B-AVARLAR",
				"C-HAZARLAR ", "D-OSMANLI DEVLETİ ", "B");
		soruListesi.add(soru9);

		Soru soru10 = new Soru("GUINESS REKORLAR KİTABINA GİREN EN AĞIR KÖPEĞİN KİLOSU KAÇTIR ?", "A-84", "B-101",
				"C-128 ", "D-135", "C");
		soruListesi.add(soru10);

		Soru soru11 = new Soru(
				"BAŞTA KANADA OLMAK ÜZERE 17 VE 18 YÜZYILLARDA  BİRÇOK FRANSIZ KOLONİSİNDE PARA OLARAK KULLANILMIŞTIR ?",
				"A-POSTA PULU", "B-BİTKİ TOHUMU", "C-İSKAMBİL KAĞIDI ", "D-CAM BONCUK", "C");
		soruListesi.add(soru11);

		Soru soru12 = new Soru("İNSAN SEVİLMEK İÇİN ÇOK ŞEY ,KISKANILMAK İÇİN HERŞEYİ YAPIYOR SÖZÜ KİME AİTTİR ?",
				"A-MARK TAWAIN", "B-AGATHA CHRİSTİE", "C-CARLIE CHAPLIN ", "D-MONROEL", "A");
		soruListesi.add(soru12);

		Soru soru13 = new Soru("EN DEĞERSİZ PARA BİRİMİ NEDİR ?", "A-RİYAL", "B-RUPİ", "C-DONG", "D-FRANG",
				"A");
		soruListesi.add(soru13);

		Soru soru14 = new Soru("TAVLA KELİMESİNİN ANLAMI NEDİR ?", "A-ŞANS", "B-PUL", "C-TAHTA", "D-ZAR", "C");
		soruListesi.add(soru14);

		Soru soru15 = new Soru("TÜRKÇEDE KELİMELER EN ÇOK HANGİ HARFLE BAŞLAR  ?", "A-K", "B-L", "C-A", "D-S", "A");
		soruListesi.add(soru15);

		Soru soru16 = new Soru("MUSTAFA KEMAL ATATÜRK'ÜN NÜFUSA KAYITLI OLDUĞU İLİMİZ ?", "A-BURSA", "B-ANKARA",
				"C-İSTANBUL", "D-GAZİANTEP", "D");
		soruListesi.add(soru16);

		Soru soru17 = new Soru("ŞAKA KELİMESİNİN ARAPCADA Kİ ANLAMI NEDİR ?", "A-SEFALET", "B-GÜLÜMSEME", "C-BAHANE",
				"D-KURNAZLIK", "A");
		soruListesi.add(soru17);

		Soru soru18 = new Soru(
				"BEDENİNİ BİLİMSEL ARAŞTIRMALARA ,KAFATASINI DA HAMLET OYUNUNDA KULLANILMAK ÜZERE BAĞIŞLAYAN SANATCI KİMDİR ?",
				"A-ÇAYKOVSKİ", "B-BACH", "C-BEETHOVEN", "D-LİZST", "A");
		soruListesi.add(soru18);

		Soru soru19 = new Soru("BİR SAATE ORTALAMA OLARAK YÜZÜMÜZE KAÇ KEZ DOKUNURUZ ?", "A-5.7", "B-15.7", "C-5.4",
				"D-7.3", "B");
		soruListesi.add(soru19);

		Soru soru20 = new Soru("ABD’de satılan giysilerin yüzde kaçı ABD’de üretilmiyor  ?", "A-%97", "B-%77",
				"C-%54", "D-%73", "A");
		soruListesi.add(soru20);

		Soru soru21 = new Soru(" Bir çay kaşığı bal üretmek için KAÇ arının ömürleri boyunca çalışması gerekir  ?",
				"A-6", "B-8", "C-10", "D-12", "D");
		soruListesi.add(soru21);

		Soru soru22 = new Soru(" En sık kullanılan şifre nedir ?", "A-123456", "B-11111", "C-101212", "D-122344",
				"A");
		soruListesi.add(soru22);

		Soru soru23 = new Soru("İSTANBULUN FETHİ HANGİ TARİHTE GERÇEKLEŞMİŞTİR ?", "A-1453", "B-1452", "C-1451",
				"D-1450", "A");
		soruListesi.add(soru23);

		Soru soru24 = new Soru("MUSTAFA KEMAL ATATÜRK HANGİ YILDA FEVAT ETMİŞTİR ?", "A-1881", "B-1938", "C-1952",
				"D-1955", "A");
		soruListesi.add(soru24);

		Soru soru25 = new Soru("seul HANGİ ÜLKENİN başkentidir ?", "A-AMERİKA", "B-ÇİN", "C-GÜNEY KORE", "D-RUSYA",
				"C");
		soruListesi.add(soru25);

		Soru soru26 = new Soru("Nobel ödülleri hangi ülkede verilmektedir ?", "A-İSVEC", "B-İSVİCRE", "C-İTALYA",
				"D-RUSYA", "A");
		soruListesi.add(soru26);

		Soru soru27 = new Soru("aşşağıdakilerden hangsini ülkemizde üretimi en azdır ?",
				"A-BUĞDAY", "B-MISIR", "C-FINDIK", "D-PİRİNÇ", "D");
		soruListesi.add(soru27);

		Soru soru28 = new Soru("Ülkemiz Avrupa Birliğine tam üyelik müzakerelerine hangi yılda başlamıştır ?",
				"A-2003", "B-2004", "C-2005", "D-2006", "C");
		soruListesi.add(soru28);

		Soru soru29 = new Soru("Çocuk hakları günü hangi tarihte kutlanmaktadır  ?", "A- 20 KASIM ", "B-21 KASIM ",
				"C-22 KASIM ", "D-23 KASIM", "A");
		soruListesi.add(soru29);

		Soru soru30 = new Soru(
				"Bir bilgisayar korsanı kullanıcıları kilitler ve kişisel bilgisayar dosyalarını ve verilerini şifreler ve saldırganı ödemeyi kabul edene kadar rehin tutar. Bu uygulamaya ne denir?  ?",
				"A- Tarayıcı Korsanı ", "B-Ransomware", "C-Kaba kuvvet", "D-İNTERNET KORSANI", "A");
		soruListesi.add(soru30);

		return soruListesi;

	}

	
	public static void zamaniBaslat() {
		TimerTask task = new TimerTask() {
	        public void run() {
	        	toplamSoruSuresi--;  
	        }
	    };
	    Timer timer = new Timer("Timer");
	    
	    long delay = 1000L;
	    timer.schedule(task, delay);
	}


	public static int getRandom(int maxSize) {
		Double randomIndex = Math.random() * maxSize;
		return randomIndex.intValue();
	}
	
	public static int getKalanSure() {
		return toplamSoruSuresi;
	}
}
