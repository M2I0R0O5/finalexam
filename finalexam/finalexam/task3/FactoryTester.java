package finalexam.task3;

public class FactoryTester {
    public static void main(String[] args) {
        // Create PaperFactory instance
        PaperFactory factory = new PaperFactory();

        // Create some Person instances
        Person person1 = new Person("Peter", "Parker", "58720");
        Person person2 = new Person("Bruce", "Wayne", "20212");

        // Add persons to the factory staff
        factory.addPerson(person1);
        factory.addPerson(person2);

        // Test deletion
        boolean deleted = factory.deletePerson(person1);
        System.out.println("Person 1 deleted: " + deleted);

        // Print details of person1 and person2
        System.out.println("\nDetails of Person 1:");
        printPersonDetails(person1);

        System.out.println("\nDetails of Person 2:");
        printPersonDetails(person2);

        // Save details of person2
        String savedResult = savePersonDetails(person2);
        System.out.println("\nSaved Result:");
        System.out.println(savedResult);
    }

    private static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.name);
        System.out.println("Surname: " + person.surname);
        System.out.println("Personal Number: " + person.personalNumber);
    }

    private static String savePersonDetails(Person person) {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(person.name).append("\n");
        sb.append("Surname: ").append(person.surname).append("\n");
        sb.append("Personal Number: ").append(person.personalNumber);
        return sb.toString();
    }
}

