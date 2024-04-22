import java.util.Scanner;

public class A3PO14{
    public static void main(String args[]){
        Scanner numIn = new Scanner(System.in);
        int a = numIn.nextInt();
        String b = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
        int c = a+1;
        System.out.println(b.substring(0,c+1));
        numIn.close();
    }
}