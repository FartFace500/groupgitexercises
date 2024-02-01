import java.util.Random;

public class Main {
    public static void main( String[] args ) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int roll = random.nextInt(100)+1;
        if (roll % 5 == 0 && roll % 3 == 0){
            System.out.println(roll+" FizzFuzz");
        } else
        if (roll % 3 == 0){
        System.out.println(roll+" Fizz");
        } else
        if (roll % 5 == 0){
            System.out.println(roll+" Fuzz");
        } else {
        System.out.println(roll);
        }
        }
    }
}