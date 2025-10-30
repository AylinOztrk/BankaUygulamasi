public class Hesap{
    private String hesapNumarasi;
    private String sahipAdi;
    private double bakiye;
    //YAPICI METOT
    public Hesap(String hesapNumarasi, String sahipAdi, double bakiye) {
        this.hesapNumarasi = hesapNumarasi;
        this.sahipAdi = sahipAdi;
        this.bakiye = bakiye;
    }
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye = bakiye + miktar;
            System.out.println(miktar + "TL yatirildi. Yeni bakiye : " + bakiye);
        } else {
            System.out.println("Geçersiz miktar! Lütfen tekrar deneyin.");
        }
    }
    public void paraCek(double miktar){
        if(bakiye>=miktar){
            bakiye=bakiye-miktar;
            System.out.println(miktar+"TL çekilmiştir. Yeni bakiyeniz: "+bakiye);
        }
        else{
            System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
        }
    }
    public void bakiyeGoster(){
       System.out.println("Hesap Sahibi"+ sahipAdi+"/"+ "Bakiye"+bakiye+"TL");
    }
    //KAPÜLLEME KULLANILMIŞTIR.
    public String getHesapNumarasi() {
        return hesapNumarasi;
    }
}