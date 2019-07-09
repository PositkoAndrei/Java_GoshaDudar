package Inheritance;

public class Main {

        public static void main(String[] args) {
            Person Vitya = new Person(120, "Vitya");

            Vitya.say("George");
            System.out.println(Vitya.name + "\'s height is " + Vitya.height);

            Person Vlad = new Person();
            System.out.println(Vlad.height);

            Person Oleg = new Person("Oleg");
            System.out.println(Oleg.name);
            System.out.println("");

            Student freshman = new Student(176, "Vasya", 2);
            freshman.tell();
            System.out.println("");
            Student Ivan = new Student(205, "Ivan", 4);
            Ivan.tell();


        }

    }





