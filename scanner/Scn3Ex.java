package scanner;

import java.util.Scanner;

public class Scn3Ex {
    // burada scanner 3 orgeni olacak
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name");

        String isim=input.nextLine();  // eger input.next girseydik bize sadece ilk kelimeyi alip kullanacakti

        System.out.println(isim.indexOf("locate"));  // locate in nerde oldugunu soyluyor

        System.out.println(isim.length()); // length of text based char "SPACE DAHIL"

        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
        System.out.println(isim.indexOf("locate"));  // locate in nerde oldugunu soyluyor
    }
}

