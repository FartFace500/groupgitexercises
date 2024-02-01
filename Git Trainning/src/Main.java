public class Main {
    public static void main( String[] args ) {
        for (int i = 0; i < 100; i++) {
        if ((int)(Math.random() * 100) % 3 == 0){
        System.out.println((int)(Math.random() * 100)+" Fizz");
        }
        if ((int)(Math.random() * 100) % 5 == 0){
            System.out.println((int)(Math.random() * 100)+" Fuzz");
        }
        if ((int)(Math.random() * 100) % 5 == 0 && (int)(Math.random() * 100) % 3 == 0){
            System.out.println((int)(Math.random() * 100)+" FizzFuzz");
        }else {
        System.out.println((int)(Math.random() * 100));
        }
        }
    }
}