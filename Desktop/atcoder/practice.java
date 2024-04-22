import java.util.Random;

public class practice {
    public static void main(String arg[]){
        Random rand = new Random();
        int a = rand.nextInt(1001) + 1;
        int b = rand.nextInt(1001) + 1;
        int c = rand.nextInt(1001) + 1;
        String s = String.valueOf(rand.nextInt(101) + 1);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(a+b+c+s);

    }
    
}
