package bankaproje;

import java.util.HashMap;
import java.util.Scanner;

public class Hesap {
    private int musterNo;
    private double bakiye;
    public HashMap<Integer,Double> hesap = new HashMap<>();
    Scanner input= new Scanner(System.in);
    public Hesap(){
        hesap.put(12345678,120.0);
        hesap.put(22222222,3000.0);
        hesap.put(98765432,7000.0);
        hesap.put(55554444, 50.0);
    }

    public double paraYukle(int musteriNo, double para){
       double bakiye=hesap.get(musteriNo);
       bakiye=bakiye+para;
       hesap.put(musteriNo,bakiye);
        return para;
    }
    public double paraCek(int musteriNo, double para){
        double bakiye=hesap.get(musteriNo);
        bakiye=bakiye-para;
        hesap.put(musteriNo,bakiye);
        return para;
    }

    public void paraCekKontrol(int musteriNo){
        bakiye=hesap.get(musteriNo);
        System.out.println("Hesap bakiyeniz : "+ bakiye);
        System.out.print( "çekmek istediğiniz miktari giriniz");
        double miktar=input.nextDouble();
        if(miktar<=0 ){
            System.out.println(" miktar negatif yada sıfır olmaz!..");
            paraCekKontrol(musteriNo);
        } else if (bakiye>=miktar) {
           bakiye= paraCek(musteriNo,miktar);
            System.out.println("işlem sonrası bakiyrniz : "+bakiye);

        } else {
            System.out.println("yeterli bakiyeniz yok");
        }


    }

    


}
