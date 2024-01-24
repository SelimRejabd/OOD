import java.util.ArrayList;
import java.util.List;

abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

}

interface Petmanage {
    void addPet(Pet pet);

    void removePet(Pet pet);

    void listPet();
}

class Petmanager implements Petmanage {
    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);  
    }

    public void listPet() {
        System.out.println("List of Pets:");
        for (Pet pet : pets){
            System.out.println(pet.getName());
        }
    }
}

public class PetManagement {
    public static void main(String args []){
        Petmanager management = new Petmanager();

        //creating dogs
        Pet dog1=new Dog("Wishkey");
        Pet cat1=new Cat("biral");

        management.addPet(dog1);
        management.addPet(cat1);
        
        management.listPet();
        management.removePet(cat1);
        management.listPet();
    }
}