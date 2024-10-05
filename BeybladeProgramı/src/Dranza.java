
public class Dranza extends Beyblade{
    
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
        
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı :"+kutsalCanavar);
        
    }
    

    @Override
    public void kutsalCanavarOrtayaCıkar() {
        super.kutsalCanavarOrtayaCıkar();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ortaya cıkarıyor.");
        System.out.println(getBeybladeci() + "ın saldırısı :Alev kılıcı");
    }
    
    
}
