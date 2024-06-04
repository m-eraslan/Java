
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("vize1:");
        int vize1= scanner.nextInt();
        
        System.out.print("vize2:");
        int vize2= scanner.nextInt();
        
        System.out.print("final:");
        int finalnot= scanner.nextInt();
        
        System.out.print("Okul ortalamsını giriniz:");
        double ortalama = scanner.nextDouble();
    
        double ort = (vize1*3/10.0)+(vize2*3/10.0)+(finalnot*4/10.0);
        
        if(ort>=90){
            System.out.print("AA aldınız");
        }
        else if (ort>=85) {
            System.out.println("BA aldınız");
        }
        else if (ort>=80) {
            System.out.println("BB aldınız");
        }
        else if (ort>=75) {
            System.out.println("CB aldınız");
        }
        else if (ort>=70) {
            System.out.println("CC aldınız");
        }
        else if (ort>=65) {
            System.out.println("CD aldınız");
        }
        else if (ort>=60) {
            System.out.println("DD aldınız");
            if(ortalama < 2.5){
                System.out.print("DD aldınız ve not ortalamınız düşük tekrar der alın");
            }
        }
        else if (ort>55) {
            System.out.println("FD aldınız ve kaldınız");
        }
        else{
            System.out.println("FF aldınız kaldınız.");
        }
    }
    
}
