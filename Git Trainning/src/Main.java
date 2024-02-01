import java.util.Random;

public class Main {
    public static void main( String[] args ) {
        int maxNumber = 200;
        {
            Random random = new Random();
            
            for ( int i = 0; i < 100; i++ ) {
                int roll = random.nextInt( maxNumber ) + 1;
                if ( roll % 5 == 0 && roll % 3 == 0 ) {
                    System.out.println( roll + " FizzFuzz" );
                } else if ( roll % 3 == 0 ) {
                    System.out.println( roll + " Fizz" );
                } else if ( roll % 5 == 0 ) {
                    System.out.println( roll + " Fuzz" );
                } else {
                    System.out.println( roll );
                }
            }
        }
        
        {
            Random random = new Random();
            int iInput;
            
            for ( int i = 0; i < 1000; i++ ) {
                
                iInput = random.nextInt( maxNumber ) + 1;
                
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
}