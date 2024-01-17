import java.util.ArrayList;
import java.util.List;

interface HousingStructure {
    void display();
}

class Room implements HousingStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Room: " + name);
    }
}

// Composite class
class Floor implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public Floor(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    public void display() {
        System.out.println("Floor: " + name);
        System.out.println("Structures on this floor:");
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }
}

// Composite class
class Building implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    public void display() {
        System.out.println("Building: " + name);
        System.out.println("Structures in this building:");
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        
        Room room1 = new Room("Living Room");
        Room room2 = new Room("Bedroom");

        Floor floor1 = new Floor("1st Floor");
        Floor floor2 = new Floor("2nd Floor");

        Building building = new Building("My House");

        floor1.addStructure(room1);
        floor2.addStructure(room2);

        building.addStructure(floor1);
        building.addStructure(floor2);

        building.display();
    }
}
