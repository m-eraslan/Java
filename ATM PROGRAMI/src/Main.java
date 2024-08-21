public class Main {
    public static void main(String[] args){
        
        ATM atm =new ATM();
        
        Hesap hesap= new Hesap("mehmet","12345",1000);
        
        atm.calıs(hesap);
        System.out.println("Programdan Çıkılıyor");
        
        
    }
}
