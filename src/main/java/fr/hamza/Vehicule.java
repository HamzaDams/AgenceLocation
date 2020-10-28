package fr.hamza;

import java.util.ArrayList;

public class Vehicule {
    String type;
    String marque;
    String energie;
    int niveauEnergie;
    String couleur;
    int energieMax;
    boolean dispo;

    ArrayList<Option> options;
    
    public Vehicule(String type, String marque, String energie, String couleur, int energieMax) {
        this.type = type;
        this.marque = marque;
        this.couleur = couleur;
        this.energie = energie;
        this.niveauEnergie = 0;
        this.dispo = true;
        this.energieMax = energieMax;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getEnergie() {
        return energie;
    }

    public void setEnergie(String energie) {
        this.energie = energie;
    }

    public int getNivEnergie() {
        return niveauEnergie;
    }

    public void setNivEnergie(int niveauEnergie) {
        this.niveauEnergie = niveauEnergie;
    }

    public boolean getDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public int getEnergieMax(){
        return energieMax;
    }

    public void setEnergieMax(int energieMax) {
        this.energieMax = energieMax;
    }


    public String toString() {
        return getType() + ": " + getMarque() + " - " + getEnergie()
                + " - " + getCouleur() + " - " + getNivEnergie();
    }
}
