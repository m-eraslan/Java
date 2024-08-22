
public class Idman {
    
    private int burpee_sayısı;
    private int pushup_sayısı;
    private int situp_sayısı;
    private int squat_sayısı;

    public Idman(int burpee_sayısı, int pushup_sayısı, int situp_sayısı, int squat_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
        this.pushup_sayısı = pushup_sayısı;
        this.situp_sayısı = situp_sayısı;
        this.squat_sayısı = squat_sayısı;
    }

    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getPush_up() {
        return pushup_sayısı;
    }

    public void setPush_up(int push_up) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }
    
    public void hareket_yap(String hareteketTuru,int sayı){
        if(hareteketTuru.equals("burpee")){
            burpeeYap(sayı);
            
        }
        else if(hareteketTuru.equals("pushup")){
            
            pushupYap(sayı);
        }
        else if(hareteketTuru.equals("situp")){
            
            situpYap(sayı);
        }
        else if(hareteketTuru.equals("squat")){
            
            squatYap(sayı);
        }
        else{
            System.out.println("Geçersiz Hareket");
        }
    }
        public void burpeeYap(int sayı){
            
            if (burpee_sayısı==0){
                System.out.println("Yapılacak burpee kalmadı.");
            }
            else if(burpee_sayısı-sayı<0){
                System.out.println("Hedefi geçtiniz tebrikler");
                burpee_sayısı=0;
                System.out.println("Kalan Burpee sayısı: "+ burpee_sayısı);
                
            }
            else{
                burpee_sayısı-=sayı;
                System.out.println("Kalan burpee sayısı: "+burpee_sayısı);
            }
        }
        public void pushupYap(int sayı){
            
            if (pushup_sayısı==0){
                System.out.println("Yapılacak pushup kalmadı.");
            }
            else if(pushup_sayısı-sayı<0){
                System.out.println("Hedefi geçtiniz tebrikler");
                pushup_sayısı=0;
                System.out.println("Kalan pushup sayısı: "+ pushup_sayısı);
                
            }
            else{
                pushup_sayısı-=sayı;
                System.out.println("Kalan pushup sayısı: "+pushup_sayısı);
            }
            
        }
        public void situpYap(int sayı){
            
            if (situp_sayısı==0){
                System.out.println("Yapılacak situp kalmadı.");
            }
            else if(situp_sayısı-sayı<0){
                System.out.println("Hedefi geçtiniz tebrikler");
                situp_sayısı=0;
                System.out.println("Kalan situp sayısı: "+ situp_sayısı);
                
            }
            else{
                situp_sayısı-=sayı;
                System.out.println("Kalan situp sayısı: "+situp_sayısı);
            }
        }
        public void squatYap(int sayı){
            
            if (squat_sayısı==0){
                System.out.println("Yapılacak squat kalmadı.");
            }
            else if(squat_sayısı-sayı<0){
                System.out.println("Hedefi geçtiniz tebrikler");
                squat_sayısı=0;
                System.out.println("Kalan squat sayısı: "+ squat_sayısı);
                
            }
            else{
                squat_sayısı-=sayı;
                System.out.println("Kalan squat sayısı: "+squat_sayısı);
            }
        }
        public boolean idmanbittimi(){
            return ((burpee_sayısı==0)&&(pushup_sayısı==0)&&(situp_sayısı==0)&&(squat_sayısı==0));
            
            
            
        }
        
        
    
    
    
    
}
