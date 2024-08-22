
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("İdman programına hoşgeldiniz");
        
        String idmanlar="Geçerli hareketler...\n"
                       + "Burpee\n"
                       + "Pushup\n"
                       + "Situp\n"
                       + "Squat";
        
        System.out.println(idmanlar);
        System.out.println("Hareket Sayılarını Giriniz");
        
        System.out.println("Burpee sayısı:");
        int burpee=scanner.nextInt();
        System.out.println("Pushup sayısı:");
        int pushup=scanner.nextInt();
        System.out.println("situp sayısı:");
        int situp=scanner.nextInt();
        System.out.println("squat sayısı:");
        int squat=scanner.nextInt();
        
        scanner.nextLine();
        
        Idman idman=new Idman(burpee, pushup, situp, squat);
        
        System.out.println("Idman Başlıyor");
        
        while (idman.idmanbittimi()==false) {
            
            System.out.println("Hareketi seçiniz(Burpee,Pushup,Situp,Squat:");
            String tur=scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız:");
            int sayı=scanner.nextInt();
            scanner.nextLine();
            idman.hareket_yap(tur, sayı);
            
        
            
            
        }
        
        
        
        
        
                
        
        
        
    }
    
}
