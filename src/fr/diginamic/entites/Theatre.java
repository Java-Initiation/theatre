package fr.diginamic.entites;

public class Theatre {

    private String nom;
    private int capaciteMax, totalInscrits;
    private double recetteTotale;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
    }

    public void inscrire(int nbClients, double prixPlace){
        for (int i = 0; i < nbClients; i++) {
            if (totalInscrits + 1 > capaciteMax){
                System.out.println("Le theatre est déjà rempli");
            }
            else{
                System.out.println("La reservation est faite");
                totalInscrits += 1;
                recetteTotale += prixPlace;
            }
        }
    }

    public int getTotalInscrits() {
        return totalInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

}
