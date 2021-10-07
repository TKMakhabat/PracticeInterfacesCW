package com.makhabatusen;


import com.makhabatusen.applicant.DistanceLearningStudent;
import com.makhabatusen.dog.Dog;
import com.makhabatusen.edition.Encyclopedia;
import com.makhabatusen.edition.Guide;
import com.makhabatusen.employee.Engineer;
import com.makhabatusen.employee.Manager;
import com.makhabatusen.fabric.Clothing;
import com.makhabatusen.fabric.Costume;
import com.makhabatusen.light.DeskLamp;
import com.makhabatusen.light.Lamp;
import com.makhabatusen.movie.Comedy;
import com.makhabatusen.movie.DomesticMovie;
import com.makhabatusen.paper.Notebook;
import com.makhabatusen.paper.SketchNotebook;
import com.makhabatusen.printing_equipment.LaserPrinter;
import com.makhabatusen.printing_equipment.Printer;
import com.makhabatusen.transport.PublicTransport;
import com.makhabatusen.transport.Tram;

public class Main {
    public static void main(String[] args) {

        String space = "\n_____";

        // Task1
        DistanceLearningStudent student = new DistanceLearningStudent("Engineering");
        student.getUniversity();
        System.out.println(student.getCourse());

        System.out.println(space);
        Encyclopedia encyclopedia = new Encyclopedia();
        encyclopedia.setGenre("Science");
        System.out.println(encyclopedia.getGenre());

        Guide guide = new Guide();
        System.out.println(guide.publishedBy());


        System.out.println(space);
        Engineer engineer = new Engineer(30000);
        System.out.println("Engineer:");
        engineer.getWorkingHours(7);

        Engineer manager = new Manager(5000);
        System.out.println("\nManager:");
        manager.getWorkingHours(8);

        System.out.println(space);
        Clothing costume = new Costume(42);
        costume.getFabricName("cotton");

        System.out.println(space);
        Lamp lamp = new DeskLamp("white");
        System.out.println(lamp.getColor());
        System.out.printf("Consuming energy: %s watt", lamp.getWattConsume(60));

        System.out.println(space);
        DomesticMovie comedy = new Comedy("1+1");
        System.out.printf("Duration of movie: %d minutes", comedy.getDuration(60));

        System.out.println(space);
        Notebook sketchBook = new SketchNotebook();
        sketchBook.getFormat("A4");

        System.out.println(space);
        Printer printer = new LaserPrinter("Canon");
        System.out.println(printer.getManufacture());
        printer.getPrintingColor("Black and White");


        System.out.println(space);
        PublicTransport tram = new Tram();
        tram.drivesTo("Karakol");


        //   Task2
        Dog dog1 = new Dog("Kuzya", "Laika", 3, "John");
        System.out.println(dog1.toString());
        changeBreed("Alabai", dog1);

        Dog dog2 = new Dog("Rex", "Alabai", 2, "Anna");
        System.out.println(dog2.toString());
        changeOwner(dog2);

    }

    public static void changeBreed(String breed, Dog dog) {
        System.out.println("\nStatic method From Main:" +
                "\n New Breed: ");
        dog.setBreed(breed);
        System.out.print(dog.getBreed());
    }

    public static void changeOwner(Dog dog) {
        System.out.println("\nStatic method From Main: " +
                "\n New Owner: ");
        switch (dog.getBreed()) {
            case "Laika":
                dog.setOwner("Alexey");
            case "Alabai":
                dog.setOwner("Murat");
                System.out.println(dog.getOwner());
        }
    }
}
