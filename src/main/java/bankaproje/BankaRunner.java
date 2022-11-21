package bankaproje;

import java.util.Scanner;

public class BankaRunner {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Musteri musteri = new Musteri();
        Kontrol kontrol = new Kontrol();
        Menu menu = new Menu();
        Hesap hesap = new Hesap();
        int musteriNo;
        int sifre;
        int sayac=3;
        int secim;
        do {
            System.out.print("Müşreti no giriniz :");
            musteriNo=input1.nextInt();
            System.out.print("Şifrenizi giriniz :");
            sifre=input2.nextInt();
           if( kontrol.musteriVarmi(musteri.sifreListesi,musteriNo,sifre)){

               break;
           }
            sayac--;
            System.out.println("müşteri no yada şifrenizi yanlış girdiniz kalan hakkınız: "+ sayac);

        }while(sayac>0);
        if (sayac==0){kontrol.son();
        }else{
            menu.menu();
            secim= input1.nextInt();
            switch (secim){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }



    }

}
