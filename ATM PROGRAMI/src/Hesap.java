public class Hesap {
    
    private String kullanıcı_adı;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcı_adı, String parola, int bakiye) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void parayatır(int tutar){
        bakiye+=tutar;
        System.out.println("Yeni bakiyeniz:"+ bakiye);
    }
    public void paraçek(int tutar){
        if(tutar> bakiye){
            System.out.println("Yeterli bakiyeniz yok...");
  
        }
        else{
            bakiye-=tutar;
            System.out.println("Yeni Bakiyeniz"+ bakiye);
                    }
        
            
        }
        
    }
    
    
    
    
    

