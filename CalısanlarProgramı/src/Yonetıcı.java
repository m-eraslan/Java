
public class Yonetıcı extends Calısan{
    private int sorumlu_kısı_sayısı;
    public Yonetıcı(String ad, String soyad, int id,int sorumlu_kısı_sayısı) {
        super(ad, soyad, id);
        this.sorumlu_kısı_sayısı=sorumlu_kısı_sayısı;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticini sorumlu olduğu kişi sayısı: "+sorumlu_kısı_sayısı);
        
    }
    public void zamYap(int zammiktarı){
        System.out.println(getAd()+"Çalışanlara "+ zammiktarı+" kadar zam yapılıyor.");
    }
    
    
    
}
