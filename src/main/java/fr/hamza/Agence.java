package fr.hamza;

import java.util.ArrayList;

public interface Agence {
    public void nomAgence();
    public String adresseAgence(String adresse);
    public String commercialAgence(String name);
    public ArrayList<Vehicule> vehiculesAgence(Vehicule... nosVehicules);
    public ArrayList<Vehicule> vehiculeDisponible();
    public ArrayList<Vehicule> vehiculeEnLocation();
    public void louerVehicule(Client name, Vehicule vehicule);
}