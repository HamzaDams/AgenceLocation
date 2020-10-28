package fr.hamza;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenceNantes implements Agence {

    ArrayList<Vehicule> listDeVehi = new ArrayList<>();


    @Override
    public void nomAgence() {
        System.out.println("Agence de Nantes");
    }

    @Override
    public String adresseAgence(String adresse) {
        return adresse;

    }

    @Override
    public String commercialAgence(String name) {
        return name;
    }

    @Override
    public ArrayList<Vehicule> vehiculesAgence(Vehicule... nosVehicules) {
        System.out.println("====STOCK====");
        for (Vehicule vehicule : nosVehicules) {
            System.out.println(vehicule);
            listDeVehi.add(vehicule);
        }
        return listDeVehi;
    }

    @Override
    public ArrayList<Vehicule> vehiculeDisponible() {
        System.out.println("====VEHI DISPO A LA LOCATION===");
        for (Vehicule vehicule : listDeVehi) {
            if(vehicule.dispo == true)  {
                if(vehicule.niveauEnergie < 0) {
                    System.out.println("Le commercial mets le plein au véhicule");
                    vehicule.niveauEnergie = vehicule.energieMax;
                }
                System.out.println(vehicule);
            } 
        }
        return null;
    }

    @Override
    public ArrayList<Vehicule> vehiculeEnLocation() {
        System.out.println("====VEHI EN LOCATION====");
        for (Vehicule vehicule : listDeVehi) {
            if(vehicule.dispo == false) {
                System.out.println(vehicule);
            }
        }
        return null;
    }

    @Override
    public void louerVehicule(Client nom, Vehicule vehicule) {
        vehicule.dispo = false;
        
        if(vehicule.niveauEnergie <= 0) {
            Scanner clavier = new Scanner(System.in);
            System.out.println("ALERT : Le vehicule a louer a un niveau de carburant a 0");
            System.out.println("Voulez vous remplir le véhicule (Y : oui)");
            if("Y".equals(clavier.next())){
                vehicule.niveauEnergie = 100;
            }

        }
        System.out.println("Le client " + nom.name + " à louer le vehicule " + vehicule);
    }
}