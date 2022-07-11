package try2;

public class sumup {
    public static void main(String[] args) {
         /*// Tip Calculator  [if-else]
Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
In his country, it's usual to tip 15% if the bill value is between 99 and 280.
If the value is different, the tip is 20%.
Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).
Example: "The bill was 275, the tip was 41.25, and the total value 316.25
Data to test 97 ,100, 275 , 25
*/


        double billvalue=275;
        double tip1=billvalue*0.15;
        double tip2=billvalue*0.20;
        double finalvalue;

        if(billvalue>=99 && billvalue<=280){
            finalvalue=tip1+billvalue;
            System.out.println("billvalue is"+billvalue +"tip is"+tip1+ "finalvalue is "+finalvalue);
        }else{
            finalvalue=tip2+billvalue;
            System.out.print(" billv   \t  alue  \t is " + "\t"+ +billvalue + "\t"+ " \t tip is \t " +tip2+ " \t finalvalue is \t " +finalvalue);
        }
    }
}
