
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        
        
        System.out.print("HOŞGELDİNİZ");
        int bakiye=1000;
        double kredi_notu=2.0;
        String islemler ="1: Bakiye öğrenme\n"
                         +"2:Para Yatırma\n"
                         +"3:Para Çekme\n"
                         +"4:Kredi Notu Öğrenme Ve Değiştirme\n"
                         +"5:Kredi Talebinde Bulunma\n"
                         +"q:Çıkış";
        System.out.println("**********");
        System.out.println("Yapmak istediğiniz işlemin kodunu seçiniz!\n"+islemler);
        System.out.println("**********");
        
        while (true) {
            System.out.println("İşlemi seçiniz:");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Çıkış Yapılıyor");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz:"+bakiye);
                
            }
            
            else if(islem.equals("2")){
                System.out.println("Yatırmak İstediğiniz Miktarı Giriniz:");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni Bakiyeniz:"+bakiye);
                
                
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek İstediğiniz Miktarı Giriniz:");
                int mıktar =scanner.nextInt();
                scanner.nextLine();
                if(bakiye-mıktar<0){
                    System.out.println("Yeterli Bakiyeniz Yok... \nBakiyeniz:"+bakiye);
                    
                }
                else{
                    bakiye-=mıktar;
                    System.out.println("Kalan Bakiyeniz:"+bakiye);
                }}
            else if(islem.equals("4")){
                    System.out.println("Kredi Notunuz:"+kredi_notu);
                    System.out.println("Kredi Notunuzu Güncelleştirmek İstiyosanız E istemiyorsanız H basınız");
                    String harf=scanner.nextLine();
                    if(harf.equals("e")){
                        System.out.println("Yeni kredi Notunuzu Giriniz:");
                        double not=scanner.nextDouble();
                        scanner.nextLine();
                        kredi_notu = not;
                        System.out.println("Yeni Kredi Notunuz:"+kredi_notu);
                        continue;
                        
                    }
                    else if(harf.equals("h")){
                        continue;
                    }
                    else{
                        System.out.println("Yanlış Giriş");
                    }
                          
                }
            else if(islem.equals("5")){
                System.out.println("Çekmek İstediğiniz Kredi Miktarını Giriniz");
                int kredı= scanner.nextInt();
                scanner.nextLine();
                if(kredı>5000){
                    if(kredi_notu>=5){
                        System.out.println("Kredi Çekebilirsiniz");
                        System.out.println("Krediniz Bakiyenize eklenmiştir.");
                        bakiye+=kredı;
                    }
                    else if(kredi_notu<5){
                        System.out.println("Kredi Notunuz düşük olduğu için kredi çekemiyorsunuz\n"
                                           +"Daha düşük miktarda kredi deneyiniz");
                        
                          
                    }
                }
                else if(kredı>=4000){
                    if(kredi_notu>4){
                        System.out.println("Kredi Çekebilirsiniz");
                        System.out.println("Krediniz Bakiyenize eklenmiştir.");
                        bakiye+=kredı;
                    }
                    else if(kredi_notu<4){
                        System.out.println("Kredi Notunuz düşük olduğu için kredi çekemiyorsunuz\n"
                                           +"Daha düşük miktarda kredi deneyiniz");
                    
                }
            }
                else if(kredı>3000){
                    if(kredi_notu>3){
                        System.out.println("Kredi Çekebilirsiniz");
                        System.out.println("Krediniz Bakiyenize eklenmiştir.");
                        bakiye+=kredı;
                    }
                    else if(kredi_notu<3){
                        System.out.println("Kredi Notunuz düşük olduğu için kredi çekemiyorsunuz\n"
                                           +"Daha düşük miktarda kredi deneyiniz");
                    
                }
            }
                else if(kredı> 2000){
                    if(kredi_notu>2){
                        System.out.println("Kredi Çekebilirsiniz");
                        System.out.println("Krediniz Bakiyenize eklenmiştir.");
                        bakiye+=kredı;
                    }
                    else if(kredi_notu<2){
                        System.out.println("Kredi Notunuz düşük olduğu için kredi çekemiyorsunuz\n"
                                           +"Daha düşük miktarda kredi deneyiniz");
                    
                }
            }
                else if(kredı>1000){
                    if(kredi_notu>1){
                        System.out.println("Kredi Çekebilirsiniz");
                        System.out.println("Krediniz Bakiyenize eklenmiştir.");
                        bakiye+=kredı;
                    }
                    else if(kredi_notu<1){
                        System.out.println("Kredi Notunuz düşük olduğu için kredi çekemiyorsunuz\n"
                                           +"Daha düşük miktarda kredi deneyiniz");
                    
                }
            }
            
            
                    
            else{
                System.out.println("Geçersiz işlem...");
            }
            
        }
        
 
      
            


            
            
        
        
      
    }
    
}}
