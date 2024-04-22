import java.util.Scanner;

public class AScoreboard {
    public static void main(String args[]){
    Scanner numIn = new Scanner(System.in);
    int count = numIn.nextInt();
    int totalA = 0;
    int totalT=0;

    for(int i = 0;i < count; i++){
        totalA = totalA + numIn.nextInt();
        totalT = totalT + numIn.nextInt();
    }
    if (totalA > totalT){
        System.out.println("Aoki");
    }else if(totalA < totalT){
        System.out.println("Takashi");
    }else{
        System.out.println("drow");
    }
    }
}
