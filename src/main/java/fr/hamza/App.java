package fr.hamza;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Agence agenceNantes = new AgenceNantes();
        Vehicule voiture1 = new Vehicule("Voiture", "BMW", "Diesel", "Rouge", 100);
        Vehicule voiture2 = new Vehicule("Voiture", "Audi", "Diesel", "Rouge", 100);
        Vehicule voiture3 = new Vehicule("Voiture", "Renault", "Diesel", "Rouge", 100);
        Client hamza = new Client("Hamza");

        agenceNantes.vehiculesAgence(voiture1, voiture2, voiture3);

        agenceNantes.vehiculeDisponible();

        agenceNantes.louerVehicule(hamza, voiture1);

        agenceNantes.vehiculeDisponible();

        agenceNantes.vehiculeEnLocation();
        
    }
}
