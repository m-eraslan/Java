
import java.util.Scanner;

public class Logın {
    public boolean login(Hesap hesap){
        
        Scanner scanner =new Scanner(System.in);
        String kullanıcı_adı;
        String parola;
        
        System.out.print("Kullanıcı adı:");
        kullanıcı_adı=scanner.nextLine();
        System.out.println("Parola:");
        parola=scanner.nextLine();
        
        if(hesap.getKullanıcı_adı().equals(kullanıcı_adı)&&hesap.getParola().equals(parola)){
            
            return true;
        }
        else{
            return false;
        }
    }
    
}
