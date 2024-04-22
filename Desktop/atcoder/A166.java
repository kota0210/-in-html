import java.util.Scanner;

public class A166 {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        if(S.equals("ABC")){
            System.out.println("ARC");
        }else if(S.equals("ARC")){
            System.out.println("ABC");
        }
    }
    
}
