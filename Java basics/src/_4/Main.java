package _4;

public class Main {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        int age=35;
        System.out.println("Exercise 1:");
        // Write your code here
        System.out.print(" My age: " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        char initialFirstName='P';
        int age=35;
        System.out.println("\nExercise 2:");
        //Write your code here
        System.out.println("My Age=" + age +", my initial=" + initialFirstName);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:"); //stampa il numero dell'esercizio da fare
        boolean hasEatenLunch = false; //inizializzazione di una variabile di tipo boolean

        double lunchCost = 5.99;//inizializzazione di una variabile di tipo boolean

        System.out.println("Lunch cost=" + lunchCost); // stampa la variabile lunchCost di tipo double e fa una concatenazione con un testo
        System.out.println("Has Eaten lunch=" + hasEatenLunch);// stampa la variabile hasEatenLunch di tipo boolean e fa una concatenazione con un testo
    }
}
