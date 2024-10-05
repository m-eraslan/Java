public class BeybladeFabrikası {
    public Beyblade beybladeUret(String beyblade_turu){
        if (beyblade_turu.equals("dragon")) {
            return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşuyor.");
           
        }
        else if (beyblade_turu.equals("dranza")) {
            return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
            
        }
        else if (beyblade_turu.equals("drayga")) {
            return new Dranza("Rei", 800, 250, "Beyaz Kaplan");
            
        }
        else if (beyblade_turu.equals("dranza")) {
            return new Dranza("Max", 400, 1000, "Kara Kamlumbağa");
            
        }
        else{
            return null;
        }
        
        
    }
    
}
