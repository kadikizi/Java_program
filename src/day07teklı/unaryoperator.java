package day07tekli;

import java.util.Scanner;

public class unaryoperator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bır tam sayı gırınız");
        int girilensayi =scanner.nextInt();

        System.out.println("Girilen sayi: " + girilensayi ++  );


        girilensayi++;

        //kullanicidan yenı bır sayı daha 55alın
        //5 sayı artırın
        //sonra yazdırın

        System.out.println("lutfen bir tam sayı girin");
        int girilenSayi2= scanner.nextInt();

        girilenSayi2++;

        System.out.println("Girilen ıkıncı sayı:" +  girilenSayi2);


    }
}
