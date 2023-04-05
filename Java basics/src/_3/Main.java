package _3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.print('P');
        System.out.print(',');
        System.out.print('C');
        System.out.print(',');
        System.out.print('C');
        System.out.print(',');
        System.out.print('V');
        System.out.print('.');
        // Write your code here
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        System.out.print("Age: ");
        System.out.println(35);
        System.out.print("Have lunch today: ");
        System.out.println(true);
        System.out.print("Price of my lunch: ");
        System.out.println(5.99);

    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        int age=35;
        boolean haveLunch=true;
        double price=5.99;
        System.out.println("\nExercise 3:");
        // Write your code here
        System.out.print("Age: ");
        System.out.println(age);
        System.out.print("Have lunch today: ");
        System.out.println(haveLunch);
        System.out.print("Price of my lunch: ");
        System.out.println(price);

    }
}
