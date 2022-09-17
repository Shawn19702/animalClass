import java.lang.reflect.Array;
import java.util.Scanner;


public class animal {
    public static void main(String[] args) {

        dog dog = new dog("John");
        cat cat = new cat("Bob");
        cow cow = new cow("Richard");

        dog.setName("Bear");
        cat.setName("Simba");
        cow.setName("Buttercup");






        Scanner scanner1 = new Scanner(System.in);

        System.out.print("How many pets do you have? ");

        scanner1.nextLine();

        System.out.print("What kind of pets do you have? ");
        scanner1.nextLine();
        scanner1.nextLine();
        scanner1.nextLine();

        System.out.print("What are your pets names? ");
        scanner1.nextLine();
        scanner1.nextLine();
        scanner1.nextLine();

        dog.speak();
        cat.speak();
        cow.speak();

        System.out.println("hi" + " " + dog.getName());
        System.out.println("hi" + " "+ cat.getName());
        System.out.println("hi" + " " + cow.getName());







    }
}