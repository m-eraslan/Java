import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {

    public static void islemleri_Bastır(){

        System.out.println("0:İşlemeleri Görüntüle");
        System.out.println("1:Bir sonraki şehre git");
        System.out.println("2:Bir önceki şehre git");
        System.out.println("3:Uygulamadan çık");
    }

    public static void sehirleri_Turla(LinkedList<String> sehirler){

        ListIterator<String>iterator=sehirler.listIterator();

        int işlem;

        islemleri_Bastır();

        Scanner scanner=new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor...");
        }
        boolean cikis=false;
        boolean ileri=true;

        while (!cikis){
            System.out.println("Bir işlem seçiniz");
            işlem=scanner.nextInt();

            switch (işlem){
                case 0:
                    islemleri_Bastır();
                    break;
                case 1:
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Şehre gidiliyor..." + iterator.next());
                    }
                    else{
                        System.out.println("Gidilecek şehir kalmadı");
                        ileri=true;
                    }

                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor "+iterator.previous());
                    }
                    else{
                        System.out.println("Şehir turu başladı");
                    }
                    break;

                case 3:
                    cikis=true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }
        }

    }

    public static void main(String[] args){

        LinkedList<String>sehirler=new LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");

        sehirleri_Turla(sehirler);




    }
}
