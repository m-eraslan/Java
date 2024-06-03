
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        String islemler= "1. toplama işlemi \n "
                        +"2. cıkarma işlemi \n"
                        +"3. carpma işlemi  \n"
                        +"4. bölme işlemi ";
        System.out.println(islemler);
        
        System.out.println("****************************");
        System.out.println("İşlemi seciniz: ");
        
        String islem = scanner.nextLine();
        int a;
        int b;
        switch(islem){
            case "1":
                System.out.print("birinci sayı:");
                a =scanner.nextInt();
                System.out.print("ikinci sayı:");
                b =scanner.nextInt();
                System.out.print("Toplam: "+ (a+b));
                break;
            case "2":
                System.out.print("birinci sayı:");
                a =scanner.nextInt();
                System.out.print("ikinci sayı:");
                b =scanner.nextInt();
                System.out.print("Fark: "+ (a-b));
                break;
            case "3":
                System.out.print("birinci sayı:");
                a =scanner.nextInt();
                System.out.print("ikinci sayı:");
                b =scanner.nextInt();
                System.out.print("Çarpım: "+ (a*b));
                break;
            case "4":
                System.out.print("birinci sayı:");
                a =scanner.nextInt();
                System.out.print("ikinci sayı:");
                b =scanner.nextInt();
                System.out.print("bölümü: "+ ((double)a/b));
                break;
            default:
                System.out.print("geçersi işlem");
                
        }
        
        
        
                
        
                
        
        
        
        
        
     
        
        
    }
}
