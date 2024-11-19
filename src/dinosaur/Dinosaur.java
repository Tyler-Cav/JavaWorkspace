package dinosaur;

public class Dinosaur {
    private String breed;
    private int age;
    private String species;
    private String diet;
    private int weight;

    public Dinosaur(String breed, int age, String species, String diet, int weight) {
        this.breed = breed;
        this.age = age;
        this.species = species;
        this.diet = diet;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", diet='" + diet + '\'' +
                ", weight=" + weight +
                '}';
    }
}
