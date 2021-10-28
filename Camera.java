package com.company;

public class Camera {
    private Integer longueur=0;
    private Integer largeur=0;

    public Integer getLongueur() {
        return longueur;
    }
    public Integer getLargeur() {
        return largeur;
    }

    public Camera(Integer longueur, Integer largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public String toString() {return  "longueur "+" largeur ";}
}
