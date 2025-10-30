import java.util.Scanner;

public class BankaUygulaması {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Hesap hesap = new Hesap("25642", "Aylin Öztürk", 1000);

        int secim;
        do {
            System.out.println("\n ---BANKA SİSTEMİ---");
            System.out.println("1-PARA YATIR");
            System.out.println("2- PARA ÇEK");
            System.out.println("3- BAKİYE GÖRÜNTÜLE");
            System.out.println("4-ÇIKIŞ");
            System.out.print("Lütfen seçiminizi yapınız : ");
            secim = giris.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yatırılacak Tutar: ");
                    double yatir = giris.nextDouble();
                    hesap.paraYatir(yatir);
                    break;
                case 2:
                    System.out.println("Çekilecek Tutarı giriniz: ");
                    double cek = giris.nextDouble();
                    hesap.paraCek(cek);
                    break;
                case 3:
                    hesap.bakiyeGoster();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim");
            }
        } while (secim != 4);
    }
}