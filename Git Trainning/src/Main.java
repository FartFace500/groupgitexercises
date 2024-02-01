import java.util.Random;

public class Main {
    public static void main( String[] args ) {
        
        for ( int i = 0; i < 1000; i++ ) {
            Random random = new Random();
            
            int iInput = random.nextInt( 100 ) + 1;
            
            System.out.println( "Input = " + iInput );
            
            if ( iInput % 3 == 0 && iInput % 5 == 0 ) {
                System.out.println( "FizzBuzz" );
            } else if ( iInput % 3 == 0 ) {
                System.out.println( "Fizz" );
            } else if ( iInput % 5 == 0 ) {
                System.out.println( "Buzz" );
            } else {
                System.out.println( iInput );
            }
            System.out.println();
        }
        
    }
}