package scanner;

import java.util.Scanner;

public class scndeneme2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter First number");

        double num1= input.nextDouble();
        System.out.println("Please enter second number");

        double num2=input.nextDouble();
        System.out.println("please Select method 1 for max  2 for min 3 for square root");

        int method=input.nextInt();

    /*    if(method==1){
            System.out.println(Math.max(num1,num2));
        }else if(method==2){
            System.out.println(Math.min(num1,num2));
        }else if (method==3){
            System.out.println(Math.sqrt(num1));
            System.out.println(Math.sqrt(num2));
        }else{
            System.out.println("invalid input");
        }
            */
        switch (method){
            case 1 : System.out.println(Math.max(num1,num2));  // if breakleri kaldirirsan butun 3 hattida yazdirir
            break;
            case 2 : System.out.println(Math.min(num1,num2));
           break;
            case 3 : System.out.println(Math.sqrt(num1)); System.out.println(Math.sqrt(num2));
            break;
            default : System.out.println("invalid enter");
        }
    }
}
