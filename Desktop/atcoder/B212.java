import java.util.Scanner;

public class B212 {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int x1 = a/1000;
        int x2 = (a-x1*1000)/100;
        int x3 = ((a-x1*1000)-x2*100)/10;
        int x4 = ((a-x1*1000)-x2*100)-x3*10;
        

    }
    
}
