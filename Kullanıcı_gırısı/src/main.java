
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int gırıs_hakkı=3;
        
        String sys_kullanıcı_adı="mehmet";
        String sys_parola="12345";
        
        System.out.println("**********");
        System.out.println("Hoşgeldiniz");
        System.out.println("**********");
        
        while (true) {
            
            System.out.println("Kullanıcı Adı:");
            String kullanıcı=scanner.nextLine();
            System.out.println("Parola:");
            String parola=scanner.nextLine();
            
            if(sys_kullanıcı_adı.equals(kullanıcı)&&(sys_parola.equals(parola))){
                System.out.println("Hoşgeldiniz...");
                break;
            }
            else if(sys_kullanıcı_adı.equals(kullanıcı) && !(sys_parola.equals(parola))){
                System.out.println("Yanlış Veya Eksik Parola Girdiniz");
                gırıs_hakkı-=1;
            }
            else if(!sys_kullanıcı_adı.equals(kullanıcı) && (sys_parola.equals(parola))){
                System.out.println("Yanlış Veya Eksik Kullanıcı Adı Girdiniz");
                gırıs_hakkı-=1;
            }
            else{
                System.out.println("Kullanıcı Adı Ve Parola Yanlış...");
                gırıs_hakkı-=1;
            }
            if(gırıs_hakkı==0){
                System.out.println("Giriş Hakkınız Bitti...");
                break;
            }
            
            
                
            
            
        }
        
        
        
        
        
        
    }
    
    
    
}
