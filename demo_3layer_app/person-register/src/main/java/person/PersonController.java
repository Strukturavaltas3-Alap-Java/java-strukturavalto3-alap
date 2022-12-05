package person;

import java.util.Scanner;

public class PersonController {

    private PersonService personService = new PersonService();

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.run();
    }

    private void run() {
        System.out.println("Adja meg a nevet:");
        String name = scanner.nextLine();
        System.out.println("Adja meg az életkort:");
        int age = Integer.parseInt(scanner.nextLine());
        personService.savePerson(name, age);
    }
}
