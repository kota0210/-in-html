import java.util.Scanner;
public class A212 {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();

        if(A >0 & B ==0){
            System.out.println("Gold");
        }else if(A ==0 & B >0){
            System.out.println("Silver");
        }else if(A + B > 0){
            System.out.println("Alloy");
        }

    }
    
}
