package packages.libraryofchallange;

import packages.challenge.Series;

public class Main {
    public static void main(String[] args) {

//        LOOK UP AT THE IMPORT STATEMENT IN LINE 3 . SO WE DID IT ACTUALLY
//        AND TAKE A LOOK AT THE EXTERNAL LIBRARIES AND YOU'LL FIND OUT IT WHAT IS GOING ON
//        LOOK UP AT THE IMPORT STATEMENT IN LINE 3 . SO WE DID IT ACTUALLY
//        AND TAKE A LOOK AT THE EXTERNAL LIBRARIES AND YOU'LL FIND OUT IT WHAT IS GOING ON
//        LOOK UP AT THE IMPORT STATEMENT IN LINE 3 . SO WE DID IT ACTUALLY
//        AND TAKE A LOOK AT THE EXTERNAL LIBRARIES AND YOU'LL FIND OUT IT WHAT IS GOING ON
//        LOOK UP AT THE IMPORT STATEMENT IN LINE 3 . SO WE DID IT ACTUALLY
//        AND TAKE A LOOK AT THE EXTERNAL LIBRARIES AND YOU'LL FIND OUT IT WHAT IS GOING ON
//        LOOK UP AT THE IMPORT STATEMENT IN LINE 3 . SO WE DID IT ACTUALLY
//        AND TAKE A LOOK AT THE EXTERNAL LIBRARIES AND YOU'LL FIND OUT IT WHAT IS GOING ON
//        LOOK UP AT THE IMPORT STATEMENT IN LINE 3 . SO WE DID IT ACTUALLY
//        AND TAKE A LOOK AT THE EXTERNAL LIBRARIES AND YOU'LL FIND OUT IT WHAT IS GOING ON

        System.out.println("Sum");
        for(int i=0;i<10;i++){
            System.out.println(Series.Sum(i));
        }
        System.out.println();

        System.out.println("Fibonnaci");
        for(int i=0;i<10;i++){
            System.out.println(Series.Fibonnaci(i));
        }
        System.out.println();

        System.out.println("Factorial");
        for(int i=0;i<10;i++){
            System.out.println(Series.Factorial(i));
        }
        System.out.println();
    }
}
