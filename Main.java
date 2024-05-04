import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
  public static void main(String[] args) {

    try {
      Person person1 = new Person("Eryk", 25);
      System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }

    try {
      Person person2 = new Person("Oskar", 20);
      System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }

    EmailMessenger emailMessenger = new EmailMessenger();

    Integer g = MathUtils.add(4, 6);
    System.out.println(g);

    emailMessenger.sendMessage("Suma dwóch liczb to: " + g.toString());

    Person[] people = new Person[5];

    final Integer b = 10;

    for (int i = 0; i < 5; i++) {
      try {
        people[i] = new Person("Losowy numer osoby: " + Integer.toString(i), 12 * (i + 1));
      } catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
      }
    }

    for (Person person : people) {
      emailMessenger.sendMessage(person.getName() + " obliczona liczba to " + person.getAge() * b);
    }

  }
}