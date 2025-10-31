package ASS3.SETA;

class Continent {
    String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }
}

class Country extends Continent {
    String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }
}

class State extends Country {
    String stateName;

    public State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }
}

class Place extends State {
    String placeName;

    public Place(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName, stateName);
        this.placeName = placeName;
    }

    public void displayDetails() {
        System.out.println("--- Location Details ---");
        System.out.println("Place: " + this.placeName);
        System.out.println("State: " + this.stateName);
        System.out.println("Country: " + this.countryName);
        System.out.println("Continent: " + this.continentName);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Place myPlace = new Place("Asia", "India", "Maharashtra", "Pune");
        myPlace.displayDetails();
    }
}