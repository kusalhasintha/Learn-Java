public class DoWhileLoop {
    public static void main (String args[]) {
        //Shows the execution of a do while loop when the initial condition is true
        System.out.println("Passing condition:");
        passingCondition();
        System.out.println();

        //Shows the execution of a do while loop when the initial condition is false
        System.out.println("Failing condition");
        failingCondition();
    }

    private static void passingCondition() {
        int x = 10;

        do {
            System.out.println("value of x : " + x );
            x++;
        }while( x < 20 );
    }

    private static void failingCondition() {
        int x = 20;

        do {
            System.out.println("value of x : " + x );
            x++;
        }while( x < 20 );
    }
}
