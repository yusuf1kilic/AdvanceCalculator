package com.company;

import java.util.Scanner;

public class Main {
    public static void calc(int a ,int b){
        System.out.println("çevresi : "+2*(a+b));
        System.out.println("Alan : "+a*b);


    }
    public static int mod(int a,int b){
        int result=a%b;
        return result;
    }

    public static void main(String[] args) {
        //Aynı projeye mod almak ve dikdörtgen alan çevre hesabını
        // yapan metotları yazıp menüde işlevsel hale getiriniz.
        Scanner input=new Scanner(System.in);
        String menu="1-mod alma\n"+"2-Dikdortgen alan ve çevre hesaplama\n"+"0-Çıkış";
        System.out.println(menu);
        while (true){
            System.out.print("lütfen bir işlem giriniz : ");
            int select= input.nextInt();
            if (select==0){
                break;
            }

            System.out.print("lütfen birinci değeri giriniz : ");
            int number= input.nextInt();
            System.out.print("lütfen ikinci değeri giriniz : ");
            int number2= input.nextInt();
            switch (select){
                case 1:
                    System.out.println("mod sonucu : "+mod(number,number2));
                    break;
                case 2:
                    calc(number,number2);
                    break;
                default:
                    System.out.println("böyle bir değer girilemez");

            }

        }
        System.out.println("güle güle");





    }
}
