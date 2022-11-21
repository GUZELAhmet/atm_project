package bankaproje;

import java.util.HashMap;

public class Kontrol {


    public boolean musteriVarmi( HashMap sifreListesi,int musteriNo, Integer sifre){


        boolean result = false;

            if (sifreListesi.containsKey(musteriNo)){
                System.out.println("müsteri no var");
                System.out.println(sifreListesi.get(musteriNo));
                if (sifreListesi.get(musteriNo).equals(sifre)) result = true;
        }
        return result;
    }

    public void son(){
        System.out.println("Şifrenizi 3 kez yanlış giridiniz");
        System.err.println("lütfen Müşteri Hizmetleri ile iletişime geçiniz.");
        System.err.println("0 123 456 78 98");
    }
}
