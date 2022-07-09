package scanner;

import java.util.Scanner;

public class Scannertest {

    public static void main(String[]args){

        // scanner bizim koda disardan giris sagliyo kullanicin verilerini cekiyoruz

        Scanner st= new Scanner(System.in);

        System.out.println("Facebook'A hos geldiniz"+"kullanici adinizi giriniz");


       String username=st.nextLine();
       System.out.println("Please enter your password");

        int password=st.nextInt();

        String user="gokhan";
        int pass=1234;

            if(username.equals(user)){
                if(password == pass){
                    System.out.println("Page is directed");
                }else if(username.equals(user)){
                    if(password != pass){
                        System.out.println("invalid Password");}}}
            else{
                System.out.println("Invalid info");

            }





    }
}
