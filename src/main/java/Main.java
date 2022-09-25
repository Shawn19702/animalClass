import java.util.Scanner;


public class Main {
    public static void main(String[] args) {






        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?:");
         int length = scanner.nextInt();

        Pet[] Pets = new Pet[length];


        for(int i = 0; i < Pets.length; i++){
            System.out.println("What kind of pet is pet" + " " +(i +1));
          String typeOfpet;
            typeOfpet = scanner.next();
            if (typeOfpet.equalsIgnoreCase("cat")){
                Pets[i] = new Cat();
            }else if (typeOfpet.equalsIgnoreCase("dog")){
                Pets[i]=new Dog();
            }else if (typeOfpet.equalsIgnoreCase("cow")){
                Pets[i] = new Cow();
            }
        }



        for(int i = 0; i < Pets.length; i++){
            System.out.println(Pets[i].getName());
            Pets[i].speak();
        }






        }







            }
