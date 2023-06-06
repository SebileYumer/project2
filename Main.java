import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Характеристика за стадион! \n" +
                " \\Натиснете бутона ENTER след като въведете необходимата информация!\\");

        Scanner input = new Scanner(System.in);
        System.out.print("Въведете наименованиe на стадиона \\CapsLock\\: ");
        String nameStadium = input.nextLine();

        System.out.print("Въведете капацитета на стадиона \\max=150 000\\: ");
        int capacity =  input.nextInt();

        System.out.print("Стадиона има ли осветление (true/false): ");
        boolean hasLights = input.nextBoolean();

        System.out.print("Въведете площта на стадиона \\max=250 000.00\\: ");
        double area = input.nextDouble();

        System.out.println();
        System.out.println("Характеристика за стадион!");
        System.out.println("Наименование на стадиона: " + nameStadium);
        System.out.println("Капацитете на стадиона е: " + capacity + " души");
        System.out.println("Осветление: " + hasLights);
        System.out.println("Площта и е: " + area + " кв.м");

    }
}