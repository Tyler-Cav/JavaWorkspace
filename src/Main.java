import dinosaur.Dinosaur;

public class Main {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur("123");

        String openingHours = "08:00";
        String closingHours = "20:00";
        String name = "Tyler";
        String position = "Park Manager";

        System.out.println("Welcome to the Mesozoic Eden");
        System.out.println("My name is " + name + " " +
                "and I want to be a " + position + "in Mesozoic Eden.");
        System.out.println("Park Opens At: " + openingHours);
        System.out.println("Park Closes At: " + closingHours);
    }
}
