package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Theatre du rond point", 15);
        theatre.inscrire(6, 4.50);
        theatre.inscrire(2, 3);
        theatre.inscrire(10, 9);

        System.out.println("Total inscrits : " + theatre.getTotalInscrits());
        System.out.println("Recette : " + theatre.getRecetteTotale());

    }

}
